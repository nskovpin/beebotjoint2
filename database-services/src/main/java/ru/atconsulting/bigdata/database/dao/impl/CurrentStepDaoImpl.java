package ru.atconsulting.bigdata.database.dao.impl;

import ru.atconsulting.bigdata.database.dao.CurrentStepDao;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;
import ru.atconsulting.bigdata.database.utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by NSkovpin on 01.08.2016.
 */
public class CurrentStepDaoImpl implements CurrentStepDao {

    private EntityManager em = HibernateUtil.getEm();

    /**
     * Find currentStep in db
     *
     * @param telegramId
     * @param ctn
     * @param flow
     * @return CurrentStep - row of db
     */
    public CurrentStep findByTelegramIdAndCtnAndFlow(String telegramId, String ctn, String flow) {
        TypedQuery<CurrentStep> namedQuery = em.createNamedQuery("CurrentStep.findByTelegramIdAndCtnAndFlow", CurrentStep.class)
                .setParameter("telegramId", telegramId)
                .setParameter("ctn", ctn)
                .setParameter("flow", flow);

        CurrentStep currentStep;
        try{
          currentStep = namedQuery.getSingleResult();
        }catch (NoResultException e){
            currentStep = null;
        }
        return currentStep;
    }

    public CurrentStep add(CurrentStep currentStep) {
        em.getTransaction().begin();
        CurrentStep curStepsFromDB = em.merge(currentStep);
        em.getTransaction().commit();
        return curStepsFromDB;
    }

    public void delete(long id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public CurrentStep get(long id) {
        return em.find(CurrentStep.class, id);
    }


    public void update(CurrentStep currentStep, String stepId) {
        CurrentStep currentStep1 = get(currentStep.getId());
        em.getTransaction().begin();
        currentStep1.setCurrentStep(stepId);
        em.getTransaction().commit();
    }

    public List<CurrentStep> findAll() {
        TypedQuery<CurrentStep> namedQuery = em.createNamedQuery("CurrentStep.findAll", CurrentStep.class);
        return namedQuery.getResultList();
    }

    /**
     * Find currentStep in db
     *
     * @param telegramId
     * @param ctn
     * @return CurrentStep - row of db
     */
    public CurrentStep findByTelegramIdAndCtn(String telegramId, String ctn) {
        TypedQuery<CurrentStep> namedQuery = em.createNamedQuery("CurrentStep.findByTelegramIdAndCtn", CurrentStep.class)
                .setParameter("telegramId", telegramId)
                .setParameter("ctn", ctn);

        CurrentStep currentStep;
        try{
            currentStep = namedQuery.getSingleResult();
        }catch (NoResultException e){
            currentStep = null;
        }
        return currentStep;
    }

    @Override
    public void removeCurrentStep(String telegramId) {
        List<CurrentStep> currentStepList = findByTelegramId(telegramId);
        for(CurrentStep currentStep : currentStepList){
            delete(currentStep.getId());
        }
    }

    /**
     * Update currentStep field (currentStep column)
     *
     * @param telegramId
     * @param ctn
     * @param flow
     * @param stepId
     */
    public void increaseCurrentStep(String telegramId, String ctn, String flow, String stepId) {
        CurrentStep currentStep = findByTelegramIdAndCtnAndFlow(telegramId, ctn, flow);
        if (currentStep == null) {
            currentStep = new CurrentStep();
            currentStep.setCtn(ctn);
            currentStep.setTelegramId(telegramId);
            currentStep.setFlow(flow);
            currentStep.setCurrentStep(stepId);

            add(currentStep);
        } else {
            update(currentStep,stepId );
        }
    }

    /**
     * Remove currentStep from db
     *
     * @param telegramId
     * @param ctn
     * @param flow
     */
    public void removeCurrentStep(String telegramId, String ctn, String flow) {
        CurrentStep currentStep = findByTelegramIdAndCtnAndFlow(telegramId, ctn, flow);
        if (currentStep != null) {
            delete(currentStep.getId());
        }
    }

    public List<CurrentStep> findByTelegramId(String telegramId){
        TypedQuery<CurrentStep> namedQuery = em.createNamedQuery("CurrentStep.findByTelegramId", CurrentStep.class)
                .setParameter("telegramId", telegramId);
        return namedQuery.getResultList();
    }

}
