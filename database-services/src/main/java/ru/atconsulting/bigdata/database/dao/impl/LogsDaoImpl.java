package ru.atconsulting.bigdata.database.dao.impl;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.dao.LogsDao;
import ru.atconsulting.bigdata.database.domain.db.logs.Log;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;
import ru.atconsulting.bigdata.database.utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public class LogsDaoImpl implements LogsDao{

    private EntityManager em = HibernateUtil.getEm();

    private boolean compareDaysOfVisits(Log log, DateTime currentTime) {
        String databaseDay = log.getDate().toString("yyyyMMdd");
        String current = currentTime.toString("yyyyMMdd");
        if (current.equals(databaseDay)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Find logs by telegramId and day
     * @param telegramId
     * @param day
     * @return Logs
     */
    public List<Log> getLogsByTelegramIdAndDay(String telegramId, DateTime day) {
        List<Log> logsList = findByTelegramId(telegramId);
        List<Log> dayList = new ArrayList<>();
        if (logsList != null && logsList.size() > 0) {
            for (Log log : logsList) {
                boolean sameDay = compareDaysOfVisits(log, day);
                if (sameDay) {
                    dayList.add(log);
                }
            }
        }
        return dayList;
    }

    public Log add(Log log) {
        em.getTransaction().begin();
        Log logFromDB = em.merge(log);
        em.getTransaction().commit();
        return logFromDB;
    }

    public void delete(long id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Log get(long id) {
        return em.find(Log.class, id);
    }

    public void update(Log log) {
        em.getTransaction().begin();
        em.merge(log);
        em.getTransaction().commit();
    }

    public List<Log> findAll() {
        TypedQuery<Log> namedQuery = em.createNamedQuery("Log.findAll", Log.class);
        return namedQuery.getResultList();
    }

    public List<Log> findByTelegramId(String telegramId) {
        TypedQuery<Log> namedQuery = em.createNamedQuery("Log.findByTelegram", Log.class).setParameter("telegramId", telegramId);
        return namedQuery.getResultList();
    }

    public List<Log> findByTelegramIdAndAdditionalLike(String telegramId, String additional) {
        TypedQuery<Log> namedQuery = em.createNamedQuery("Log.findByTelegramAndAdditionalLike", Log.class)
                .setParameter("telegramId", telegramId)
                .setParameter("additional", "%" + additional + "%");
        return namedQuery.getResultList();
    }

}
