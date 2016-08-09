import org.junit.Test;
import ru.atconsulting.bigdata.database.dao.impl.CurrentStepDaoImpl;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;

import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public class CurrentStepTest {

    CurrentStepDaoImpl currentStepDao = new CurrentStepDaoImpl();

    @Test
    public void saveCurrentStepTest(){
        String ctn = "78";
        String flow = "79";
        String telegramId = "80";

        CurrentStep currentStep = new CurrentStep();
        currentStep.setCtn(ctn);
        currentStep.setFlow(flow);
        currentStep.setTelegramId(telegramId);
        currentStep.setCurrentStep("START");

        currentStepDao.add(currentStep);

        CurrentStep currentStep1 = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId,ctn,flow);

        List<CurrentStep> currentStepList = currentStepDao.findAll();

        assert currentStepList != null && currentStepList.size() > 0;

        assert currentStep1 != null && currentStep.getTelegramId().equals(telegramId);

        currentStepDao.delete(currentStep1.getId());

    }

    @Test
    public void updateCurrentStepTest(){

        String ctn = "100";
        String flow = "101";
        String telegramId = "102";

        final String start = "START";

        CurrentStep currentStep = new CurrentStep();
        currentStep.setCtn(ctn);
        currentStep.setFlow(flow);
        currentStep.setTelegramId(telegramId);
        currentStep.setCurrentStep(start);

        currentStepDao.add(currentStep);

        CurrentStep currentStep1 = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId,ctn,flow);

        assert currentStep1 != null && currentStep1.getTelegramId().equals(telegramId)
                && currentStep1.getCurrentStep().equals(start);

        final String end = "end";

        currentStepDao.update(currentStep1, end);

        CurrentStep currentStep2 = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId,ctn,flow);

        assert currentStep2 != null && currentStep2.getTelegramId().equals(telegramId)
                && currentStep2.getCurrentStep().equals(end);

        currentStepDao.delete(currentStep2.getId());

    }


    @Test
    public void increaseStepTest(){

        String ctn = "1001";
        String flow = "1001";
        String telegramId = "1001";

        final String start = "START";

        CurrentStep currentStep = new CurrentStep();
        currentStep.setCtn(ctn);
        currentStep.setFlow(flow);
        currentStep.setTelegramId(telegramId);
        currentStep.setCurrentStep(start);

        currentStepDao.add(currentStep);

        CurrentStep currentStep1 = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId,ctn,flow);

        assert currentStep1 != null && currentStep1.getTelegramId().equals(telegramId)
                && currentStep1.getCurrentStep().equals(start);

        final String end = "end";

        currentStepDao.increaseCurrentStep(telegramId, ctn, flow , end);

        CurrentStep currentStep2 = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId,ctn,flow);

        assert currentStep2 != null && currentStep2.getTelegramId().equals(telegramId)
                && currentStep2.getCurrentStep().equals(end);

        currentStepDao.removeCurrentStep(telegramId, ctn, flow);

    }

}
