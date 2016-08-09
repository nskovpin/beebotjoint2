package ru.beeline.bigdata.flowmanager.workflow.actions;

import org.telegram.telegrambots.TelegramApiException;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import ru.atconsulting.bigdata.database.dao.CurrentStepDao;
import ru.atconsulting.bigdata.database.dao.impl.CurrentStepDaoImpl;
import ru.atconsulting.bigdata.database.dao.impl.LogsDaoImpl;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.beeline.bigdata.flowmanager.workflow.ClientTelegramCtnFlow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;
import ru.beeline.bigdata.flowmanager.workflow.utils.PyConnector;

import java.io.IOException;

/**
 * Created by NSkovpin on 08.08.2016.
 */
public class SolveProblemAction extends MessageGenerator implements Action {

    private CurrentStepDao currentStepDao;

    private Step step;

    private Flow flow;

    private TelegramLongPollingBot telegramLongPollingBot;

    private Message message;

    private ClientTelegramCtnFlow clientTelegramCtnFlow;

    private boolean pythonResult = false;

    public SolveProblemAction(Step step, Flow flow, ClientTelegramCtnFlow clientTelegramCtnFlow, TelegramLongPollingBot telegramLongPollingBot, Message message) {
        this.step = step;
        this.flow = flow;
        this.telegramLongPollingBot = telegramLongPollingBot;
        this.message = message;
        this.clientTelegramCtnFlow = clientTelegramCtnFlow;
        this.currentStepDao = new CurrentStepDaoImpl();
    }

    @Override
    public Object run() throws Exception {
        String workflowName = getWorkflowName(message);
        pythonResult = workflowName != null;
        String textFromPython = getTextForClient(workflowName);
        Object send = null;
        SendMessage msgToSend = prepareMessageForUser(message, step, flow, textFromPython);
        try {
            send = telegramLongPollingBot.sendMessage(msgToSend);
            saveLog(clientTelegramCtnFlow.getClient(), ((Message)send).getText(), "BOT MESSAGE", new LogsDaoImpl());
        } catch (TelegramApiException e) {
            e.printStackTrace();
            SendMessage errorMsg = new SendMessage();
            errorMsg.setText("Sorry, try another one");
            errorMsg.setChatId(message.getChatId().toString());
            try {
                telegramLongPollingBot.sendMessage(errorMsg);
            } catch (TelegramApiException e1) {
                e1.printStackTrace();
            }
        }

        if (send != null) {
            CurrentStep currentStep = currentStepDao.findByTelegramIdAndCtnAndFlow(clientTelegramCtnFlow.getTelegramId(),
                    clientTelegramCtnFlow.getCtn(), clientTelegramCtnFlow.getFlow().getName());
            if (currentStep == null) {
                currentStep = new CurrentStep();
                currentStep.setTelegramId(clientTelegramCtnFlow.getTelegramId());
                currentStep.setCtn(clientTelegramCtnFlow.getCtn());
                currentStep.setFlow(clientTelegramCtnFlow.getFlow().getName());
            }
            currentStep.setFutureFlow(workflowName);
            currentStepDao.add(currentStep);
        }
        return send;
    }

    @Override
    public SendMessage prepareMessageForUser(Message message, Step step, Flow flow, String textToSend) {
        SendMessage msgToSend = new SendMessage();
        msgToSend.setChatId(message.getChatId().toString());

        // Set question or just text
        if(textToSend != null){
            msgToSend.setText(textToSend);
        }

        // Set answer
        Step stepWithAnswers = flow.findStepByName(step.getRef());
        if(stepWithAnswers.getDecisions() != null && pythonResult){
            msgToSend.setReplayMarkup(prepareKeyboard(getAnswerChoices(stepWithAnswers)));
        }

        return msgToSend;
    }

    @Override
    public Step getStep() {
        return step;
    }



    private String getTextForClient(String inputText) {
        String replyText;

        if (inputText != null) {

            replyText = "Вот что я понял про тебя: \n" + inputText;
        } else {
            replyText = "А, ниче я не понял. К классификатору не могу подключиться...";
        }
        return replyText;
    }

    private String getWorkflowName(Message message) {
        String workflowName = null;
        try {
            workflowName = PyConnector.getInstance().getWorkflow(message.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workflowName;
    }

}
