package ru.beeline.bigdata.flowmanager.workflow;

import org.joda.time.DateTime;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import ru.atconsulting.bigdata.database.dao.*;
import ru.atconsulting.bigdata.database.dao.impl.*;
import ru.atconsulting.bigdata.database.domain.answer.Answer;
import ru.atconsulting.bigdata.database.domain.answer.ErrorAnswer;
import ru.atconsulting.bigdata.database.domain.answer.StepAnswer;
import ru.atconsulting.bigdata.database.domain.db.logs.Log;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.steps.StepResults;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.beeline.bigdata.flowmanager.workflow.actions.*;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;
import ru.beeline.bigdata.flowmanager.workflow.utils.DataBaseUtils;

import javax.persistence.NoResultException;
import java.util.Date;
import java.util.List;

/**
 * Created by NSkovpin on 04.08.2016.
 */
public class Workflow extends DataBaseUtils{

    private CurrentStepDao currentStepDao;

    private StepResultsDao stepResultsDao;

    private ClientDao clientDao;

    private VisitsDao visitsDao;

    private LogsDao logsDao;

    private ConfigurationHolder configurationHolder;

    private String searchFlag;

    public static final String END = "end";

    private final String ERROR = "Error";

    private static Workflow workflow;

    public static Workflow getWorkflowInstance(ConfigurationHolder configurationHolder) {
        if (workflow == null) {
            workflow = new Workflow(configurationHolder);
        }
        return workflow;
    }

    private Workflow(ConfigurationHolder configurationHolder) {
        this.configurationHolder = configurationHolder;
        this.searchFlag = configurationHolder.getProperties()
                .getProperty(PropertiesLoader.Params.WORKFLOW_SEARCH_FLAG.getValue());
        this.currentStepDao = new CurrentStepDaoImpl();
        this.stepResultsDao = new StepResultsDaoImpl();
        this.clientDao = new ClientDaoImpl();
        this.logsDao = new LogsDaoImpl();
        this.visitsDao = new VisitsDaoImpl();
    }

    public void processAction(TelegramLongPollingBot telegramLongPollingBot, Message message, String telegramId, String ctn, String flowId) {
        // find client in database
        Client client = getClientFromDataBase(telegramId, clientDao);
        //increase visits
        increaseVisits(client, visitsDao);

        Flow flow = flowId != null
                ? configurationHolder.getFlowHolder().getFlowById(flowId)
                : null;

        FlowAndStepAndResult flowAndStepToProcessAndPreviousResult;
        try {
            //find step in database or take first
            flowAndStepToProcessAndPreviousResult = getCurrentStep(telegramId, ctn, flow);
        } catch (Exception e) {
            e.printStackTrace();
            saveLog(client, e.getMessage(), ERROR, logsDao);
            throw new RuntimeException("Can't find steps");
        }

        ClientTelegramCtnFlow clientTelegramCtnFlow = new ClientTelegramCtnFlow();
        clientTelegramCtnFlow.setClient(client);
        clientTelegramCtnFlow.setTelegramId(telegramId);
        clientTelegramCtnFlow.setCtn(ctn);
        clientTelegramCtnFlow.setFlow(flowAndStepToProcessAndPreviousResult.getFlow());


        Action action = ActionEnum.getActionByName(flowAndStepToProcessAndPreviousResult.getStepToProcess(), clientTelegramCtnFlow, configurationHolder, flowAndStepToProcessAndPreviousResult.getPreviousStepResult(), telegramLongPollingBot, message);
        Object inputObject = flowAndStepToProcessAndPreviousResult.getPreviousStepResult();

        //this case appears after request action. We should process client answer
        if(action instanceof DecisionAction){
            inputObject = message.getText();
            ((DecisionAction)action).setInput(inputObject);
            saveLog(clientTelegramCtnFlow.getClient(), (String)inputObject, "CLIENT MESSAGE", logsDao);
        }

        executeAction(flowAndStepToProcessAndPreviousResult.getStepToProcess(), clientTelegramCtnFlow, configurationHolder, inputObject, action, telegramLongPollingBot, message);

    }

    public Step executeAction(Step step, ClientTelegramCtnFlow clientTelegramCtnFlow, ConfigurationHolder configurationHolder,
                              Object inputObject, Action action, TelegramLongPollingBot telegramLongPollingBot, Message message) {
        if (step == null) {
            return null;
        }
        Object answer = null;
        try {
            answer = action.run();
        } catch (Exception e) {
            saveLog(clientTelegramCtnFlow.getClient(), e.getMessage(), ERROR, logsDao);
            try {
                executeErrorAction(step, clientTelegramCtnFlow, configurationHolder, inputObject, action, telegramLongPollingBot, message);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            return null;
        }

        if (action instanceof GlassfishAction && answer == null) {
            glassfishLoop:
            for (int i = 0; i < 3; i++) {
                try {
                    answer = action.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (answer != null) {
                    break glassfishLoop;
                }
            }
            if (answer == null) {
                saveLog(clientTelegramCtnFlow.getClient(), "Glassfish failed 3 times", ERROR, logsDao);
                throw new RuntimeException("Glassfish failed 3 times");
            }
        }

        if (answer == null) {
            saveLog(clientTelegramCtnFlow.getClient(), "Step answer is null", ERROR, logsDao);
            try {
                executeErrorAction(step, clientTelegramCtnFlow, configurationHolder, inputObject, action, telegramLongPollingBot, message);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        StepAnswer<Object> stepAnswer = new StepAnswer<>();
        stepAnswer.setStep(step.getName());
        stepAnswer.setAction(step.getInstruction().getName());
        stepAnswer.setTelegramId(clientTelegramCtnFlow.getTelegramId());
        stepAnswer.setInfo(answer);

        saveStepResults(step, clientTelegramCtnFlow.getClient(),
                clientTelegramCtnFlow.getTelegramId(), clientTelegramCtnFlow.getCtn(),
                clientTelegramCtnFlow.getFlow().getName(), stepAnswer, currentStepDao, stepResultsDao);

        if (step.getName().equals(END) ||
                step.getInstruction().getName().equals(ActionEnum.REQUEST_instruction.name())) {

            if (step.getName().equals(END)) {
                removeCurrentStep(clientTelegramCtnFlow.getTelegramId());
            }

            return null;
        }

        String stepNextName = (action instanceof DecisionAction) ? (String) answer : step.getRef();
        Step stepNext = clientTelegramCtnFlow.getFlow().findStepByName(stepNextName);

        if (stepNextName.equals(searchFlag)) {
            Flow futureFlow = findFutureFlow(clientTelegramCtnFlow);
            clientTelegramCtnFlow.setFlow(futureFlow);
            stepNext = futureFlow.findFirstStep();
        }

        Action action1 = ActionEnum.getActionByName(stepNext, clientTelegramCtnFlow, configurationHolder, answer, telegramLongPollingBot, message);

        Step s = executeAction(stepNext, clientTelegramCtnFlow, configurationHolder, answer, action1, telegramLongPollingBot, message);

        return stepNext;
    }

    private Object executeErrorAction(Step step, ClientTelegramCtnFlow clientTelegramCtnFlow, ConfigurationHolder configurationHolder,
                                      Object inputObject, Action action, TelegramLongPollingBot telegramLongPollingBot, Message message) throws Exception {

        Step errorStep = clientTelegramCtnFlow.getFlow().findStepByName(step.getError());
        Action action1 = ActionEnum.getActionByName(errorStep, clientTelegramCtnFlow, configurationHolder, inputObject, telegramLongPollingBot, message);
        return action1.run();
    }

    private Flow findFutureFlow(ClientTelegramCtnFlow clientTelegramCtnFlow) {
        CurrentStep currentStep = currentStepDao.findByTelegramIdAndCtnAndFlow(clientTelegramCtnFlow.getTelegramId(),
                clientTelegramCtnFlow.getCtn(), clientTelegramCtnFlow.getFlow().getName());
        if (currentStep == null || currentStep.getFutureFlow() == null || currentStep.getFutureFlow().isEmpty()) {
            throw new RuntimeException("FutureFlow search has failed");
        }
        return configurationHolder.getFlowHolder().getFlowByName(currentStep.getFutureFlow());
    }

    private void removeCurrentStep(String telegramId) {
        currentStepDao.removeCurrentStep(telegramId);
    }


    public FlowAndStepAndResult getCurrentStep(String telegramId, String ctn, Flow flowInput) throws Exception {
        Action checkCurrentStepAction = new CheckCurrentStepAction(telegramId, ctn);
        Object checkAnswer = checkCurrentStepAction.run();

        String flowName = checkAnswer != null ? ((CurrentStep) checkAnswer).getFlow() : "";

        Flow flow = null;
        if (flowInput == null) {
            flow = !flowName.isEmpty() ? configurationHolder.getBeginningFlowHolder()
                    .getFlowByName(flowName) : configurationHolder.getBeginningFlowHolder().getFlowWithSmallestId();

            flow = flow == null && !flowName.isEmpty() ? configurationHolder.getFlowHolder().getFlowByName(flowName) : flow;

        } else {
            flow = flowInput;
        }

        if (flow == null) {
            throw new RuntimeException("Impossible to find flow");
        }

        Step nextStep;
        Object stepResult = null;
        if (checkAnswer == null) {

            nextStep = flow.findFirstStep();
        } else {
            Step savedStep = flow.findStepByName(((CurrentStep) checkAnswer).getCurrentStep());

            List<StepResults> stepResultsList = stepResultsDao.findByCurrentStep(((CurrentStep) checkAnswer));
            Answer answer = stepResultsList != null && stepResultsList.size() > 0 ? stepResultsList.get(stepResultsList.size() - 1).getResult() : null;
            stepResult = answer instanceof StepAnswer ? ((StepAnswer) answer).getInfo() : null;
            if (savedStep.getInstruction().getName().equals(ActionEnum.DECISION_instruction.name())) {
                nextStep = flow.findStepByName((String) stepResult);
            } else {
                nextStep = flow.findStepByName(savedStep.getRef());
            }
        }

        FlowAndStepAndResult flowAndStepAndResult = new FlowAndStepAndResult();
        flowAndStepAndResult.setFlow(flow);
        flowAndStepAndResult.setStepToProcess(nextStep);
        flowAndStepAndResult.setPreviousStepResult(stepResult);
        return flowAndStepAndResult;
    }

}
