
import org.junit.Test;
import ru.atconsulting.bigdata.database.dao.*;
import ru.atconsulting.bigdata.database.dao.impl.*;
import ru.atconsulting.bigdata.database.domain.db.logs.Log;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.steps.StepResults;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;
import ru.beeline.bigdata.flowmanager.workflow.ConfigurationHolder;
import ru.beeline.bigdata.flowmanager.workflow.Workflow;

import java.util.List;

/**
 * Created by NSkovpin on 05.08.2016.
 */
public class FlowTest {

    private StepResultsDao stepResultsDao = new StepResultsDaoImpl();

    private LogsDao logsDao = new LogsDaoImpl();

    private VisitsDao visitsDao = new VisitsDaoImpl();

    private CurrentStepDao currentStepDao = new CurrentStepDaoImpl();

    private ClientDao clientDao = new ClientDaoImpl();

    @Test
    public void testFlow3() {

        String ctn = "9610138780";
        String telegramId = "6666666666";
        String flowId = "3";

        ConfigurationHolder configurationHolder = ConfigurationHolder.getInstance();

        Workflow workflow = Workflow.getWorkflowInstance(configurationHolder);

        try {
            workflow.processAction(null, null, telegramId, ctn, flowId);
        }catch (Exception e){
            e.printStackTrace();
        }

        List<StepResults> stepResults = stepResultsDao.findAll();
        assert stepResults != null && stepResults.size() > 0;

        for (StepResults stepResult : stepResults) {
            stepResultsDao.delete(stepResult.getId());
        }

        List<Log> logList = logsDao.findByTelegramId(telegramId);

        for (Log log : logList) {
            logsDao.delete(log.getLogId());
        }

        CurrentStep currentStep = currentStepDao.findByTelegramIdAndCtn(telegramId, ctn);
        if (currentStep != null) {
            currentStepDao.delete(currentStep.getId());
        }

        List<Visits> visitsList = visitsDao.findByTelegramId(telegramId);

        assert visitsList.size()> 0;

        for(Visits visit : visitsList){
            visitsDao.delete(visit.getVisitId());
        }

        Client client = clientDao.findByTelegramId(telegramId);
        assert client != null;

        clientDao.delete(client.getClientId());


    }
}
