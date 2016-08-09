package ru.beeline.bigdata.flowmanager.workflow.actions;

import ru.atconsulting.bigdata.database.dao.CurrentStepDao;
import ru.atconsulting.bigdata.database.dao.impl.CurrentStepDaoImpl;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

/**
 * Created by NSkovpin on 20.06.2016.
 * Check currentStep in db. If we find currentStep, we will start from this step.
 */

public class CheckCurrentStepAction implements Action {


    private CurrentStepDao currentStepDao;

    private String telegramId;

    private String ctn;

    public CheckCurrentStepAction( String telegramId, String ctn){
        this.telegramId = telegramId;
        this.ctn = ctn;
        this.currentStepDao = new CurrentStepDaoImpl();
    }

    @Override
    public Object run() {
        CurrentStep currentStep = currentStepDao.findByTelegramIdAndCtn(telegramId, ctn);
        return currentStep;
    }

    @Override
    public Step getStep() {
        return null;
    }

}
