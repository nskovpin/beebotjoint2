
import org.junit.Test;
import ru.atconsulting.bigdata.database.dao.ClientDao;
import ru.atconsulting.bigdata.database.dao.impl.ClientDaoImpl;
import ru.atconsulting.bigdata.database.dao.impl.CurrentStepDaoImpl;
import ru.atconsulting.bigdata.database.dao.impl.StepResultsDaoImpl;
import ru.atconsulting.bigdata.database.domain.answer.Answer;
import ru.atconsulting.bigdata.database.domain.answer.ErrorAnswer;
import ru.atconsulting.bigdata.database.domain.answer.StepAnswer;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.steps.StepResults;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;
import ru.atconsulting.bigdata.services.glassfish.sis.Corebalance;
import ru.atconsulting.bigdata.services.glassfish.sis.HLC;
import ru.atconsulting.bigdata.services.glassfish.sis.Response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public class StepResultsTest {

    private StepResultsDaoImpl stepResultsDao = new StepResultsDaoImpl();

    private CurrentStepDaoImpl currentStepDao = new CurrentStepDaoImpl();

    private ClientDaoImpl clientDao = new ClientDaoImpl();

    @Test
    public void addResultTest(){
        String stepId = "1";
        String telegramId = "333333";
        ErrorAnswer errorAnswer = new ErrorAnswer();
        errorAnswer.setAction("GLASSFISH");
        errorAnswer.setError("Socket exception");
        errorAnswer.setStep(stepId);
        errorAnswer.setTelegramId(telegramId);

        String ctn = "1111";
        String flowId = "1111";
        CurrentStep currentStep = new CurrentStep();
        currentStep.setCtn(ctn);
        currentStep.setFlow(flowId);
        currentStep.setTelegramId(telegramId);

        Client client = clientDao.findOrCreateClient(telegramId);
        clientDao.add(client);


        currentStepDao.add(currentStep);
        CurrentStep currentStep1 = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId,ctn,flowId);

        stepResultsDao.addStepResult(errorAnswer, stepId, currentStep1, client, null);

        List<StepResults> stepResults = stepResultsDao.findAll();

        assert stepResults != null && stepResults.size() > 0;


        List<StepResults> StepResultsList1 = stepResultsDao.findByTelegramId(currentStep1);
        for(StepResults res : StepResultsList1){
            stepResultsDao.delete(res.getId());
        }

        currentStepDao.delete(currentStep1.getId());

        clientDao.delete(client.getClientId());
    }

    @Test
    public void addDifficultResultTest(){
        String stepId = "11";
        String telegramId = "3333133";

        Response response = new Response();
        response.setCtn("123");
        Corebalance corebalance = new Corebalance();
        corebalance.setBalanceAmount("15");
        response.setCorebalance(corebalance);

        HLC hlc = new HLC();
        hlc.setInHLC(new BigInteger("11"));
        response.setHLC(hlc);

        StepAnswer stepAnswer = new StepAnswer();
        stepAnswer.setAction("GLASSFISH");
        stepAnswer.setInfo(response);
        stepAnswer.setStep(stepId);
        stepAnswer.setTelegramId(telegramId);

        String ctn = "11111";
        String flowId = "11111";
        CurrentStep currentStep = new CurrentStep();
        currentStep.setCtn(ctn);
        currentStep.setFlow(flowId);
        currentStep.setTelegramId(telegramId);

        Client client = clientDao.findOrCreateClient(telegramId);
        clientDao.add(client);

        currentStepDao.add(currentStep);
        CurrentStep currentStep1 = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId,ctn,flowId);

        stepResultsDao.addStepResult(stepAnswer, stepId, currentStep1, client, null);

        List<StepResults> stepResults = stepResultsDao.findAll();

        assert stepResults != null && stepResults.size() > 0;


        List<StepResults> StepResultsList1 = stepResultsDao.findByTelegramId(currentStep1);
        for(StepResults res : StepResultsList1){
            stepResultsDao.delete(res.getId());
        }

        currentStepDao.delete(currentStep1.getId());
        clientDao.delete(client.getClientId());
    }

}
