package ru.atconsulting.bigdata.database.dao;

import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;

import java.util.List;

/**
 * Created by NSkovpin on 01.08.2016.
 */
public interface CurrentStepDao extends BasicDao<CurrentStep>{

    CurrentStep findByTelegramIdAndCtnAndFlow(String telegramId, String ctn, String flow);

    void update(CurrentStep currentStep, String stepId);

    CurrentStep get(long id);

    void increaseCurrentStep(String telegramId, String ctn, String flow, String stepId);

    void removeCurrentStep(String telegramId, String ctn, String flow);

    CurrentStep findByTelegramIdAndCtn(String telegramId, String ctn);

    void removeCurrentStep(String telegramId);
}
