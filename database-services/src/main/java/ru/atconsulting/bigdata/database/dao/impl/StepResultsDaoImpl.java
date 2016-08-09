package ru.atconsulting.bigdata.database.dao.impl;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.dao.ClientDao;
import ru.atconsulting.bigdata.database.dao.CurrentStepDao;
import ru.atconsulting.bigdata.database.dao.StepResultsDao;
import ru.atconsulting.bigdata.database.domain.answer.Answer;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.steps.StepResults;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.atconsulting.bigdata.database.utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by NSkovpin on 01.08.2016.
 */
public class StepResultsDaoImpl implements StepResultsDao {

    private EntityManager em;

    private CurrentStepDao currentStepDao;

    private ClientDao clientDao;

    public StepResultsDaoImpl() {
        this.em = HibernateUtil.getEm();
        this.currentStepDao = new CurrentStepDaoImpl();
        this.clientDao = new ClientDaoImpl();
    }

    /**
     * Save stepResult to db
     * @param stepAnswer
     * @param stepId
     * @param currentStep
     */
    public void addStepResult(Answer stepAnswer, String stepId, CurrentStep currentStep, Client client, DateTime dateTime) {
        StepResults stepResults = new StepResults();
        stepResults.setResult(stepAnswer);
        stepResults.setStep(stepId);
        stepResults.setCurrentStep(currentStep);
        stepResults.setClient(client);
        stepResults.setDate(dateTime);
        add(stepResults);
    }

    /**
     * Find all stepResults which have same currentStep index
     * @param currentStep
     * @return
     */
    public List<StepResults> findByCurrentStep(CurrentStep currentStep) {
        CurrentStep currentStep1 = currentStepDao.get(currentStep.getId());
        TypedQuery<StepResults> namedQuery = em.createNamedQuery("StepResults.findByCurrentStep", StepResults.class)
                .setParameter("curStepId", currentStep1.getId());
        return namedQuery.getResultList();
    }


    public List<StepResults> findByTelegramId(CurrentStep currentStep) {
        CurrentStep currentStep1 = currentStepDao.get(currentStep.getId());
        TypedQuery<StepResults> namedQuery = em.createNamedQuery("StepResults.findByTelegramId", StepResults.class)
                .setParameter("telegramId", currentStep1.getTelegramId());
        return namedQuery.getResultList();
    }

    public List<StepResults> findByTelegramId(Client client) {
        Client client1 = clientDao.get(client.getClientId());
        TypedQuery<StepResults> namedQuery = em.createNamedQuery("StepResults.findByTelegramId", StepResults.class)
                .setParameter("telegramId", client1.getTelegramId());
        return namedQuery.getResultList();
    }

    public StepResults add(StepResults stepResult) {
        em.getTransaction().begin();
        StepResults stepResultFromDB = em.merge(stepResult);
        em.getTransaction().commit();
        return stepResultFromDB;
    }

    public void delete(long id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public StepResults get(long id) {
        return em.find(StepResults.class, id);
    }

    public List<StepResults> findAll() {
        TypedQuery<StepResults> namedQuery = em.createNamedQuery("StepResults.findAll", StepResults.class);
        return namedQuery.getResultList();
    }

}
