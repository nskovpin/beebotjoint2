package ru.beeline.bigdata.flowmanager.workflow.utils;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.dao.*;
import ru.atconsulting.bigdata.database.domain.answer.Answer;
import ru.atconsulting.bigdata.database.domain.answer.ErrorAnswer;
import ru.atconsulting.bigdata.database.domain.db.logs.Log;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

import javax.persistence.NoResultException;
import java.util.Date;

/**
 * Created by NSkovpin on 08.08.2016.
 */
public class DataBaseUtils {

    public void saveStepResults(Step step, Client client, String telegramId, String ctn, String flowId, Answer stepAnswer,
                                 CurrentStepDao currentStepDao, StepResultsDao stepResultsDao) {

        if (!(stepAnswer instanceof ErrorAnswer))
            currentStepDao.increaseCurrentStep(telegramId, ctn, flowId, step.getName());

        CurrentStep currentStep = currentStepDao.findByTelegramIdAndCtnAndFlow(telegramId, ctn, flowId);
        stepResultsDao.addStepResult(stepAnswer, step.getName(), currentStep, client, new DateTime(new Date()));
    }

    public Client getClientFromDataBase(String telegramId, ClientDao clientDao) {
        Client client;
        try {
            client = clientDao.findOrCreateClient(telegramId);
        } catch (NoResultException e) {
            client = new Client();
            client.setTelegramId(telegramId);
            client = clientDao.add(client);
        }
        return client;
    }

    public void increaseVisits(Client client, VisitsDao visitsDao) {
        Date date = new Date();
        DateTime dateTime = new DateTime(date);
        visitsDao.saveOrUpdateCounter(client.getTelegramId(), dateTime);
    }

    public void saveLog(Client client, String text, String additional, LogsDao logsDao) {
        Log log = new Log();
        log.setClient(client);
        log.setDate(new DateTime(new Date()));
        log.setText(text);
        log.setAdditional(additional);
        logsDao.add(log);
    }
}
