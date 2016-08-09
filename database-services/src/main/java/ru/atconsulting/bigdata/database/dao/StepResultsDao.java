package ru.atconsulting.bigdata.database.dao;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.domain.answer.Answer;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.steps.StepResults;
import ru.atconsulting.bigdata.database.domain.db.user.Client;

import java.util.List;

/**
 * Created by NSkovpin on 01.08.2016.
 */
public interface StepResultsDao extends BasicDao<StepResults>{

    void addStepResult(Answer stepAnswer, String stepId, CurrentStep currentStep, Client client, DateTime dateTime);

    List<StepResults> findByCurrentStep(CurrentStep currentStep);

    List<StepResults> findByTelegramId(Client client);

    List<StepResults> findByTelegramId(CurrentStep currentStep);


}
