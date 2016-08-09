package ru.atconsulting.bigdata.database.dao.impl;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.dao.ClientDao;
import ru.atconsulting.bigdata.database.dao.VisitsDao;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;
import ru.atconsulting.bigdata.database.utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by NSkovpin on 01.08.2016.
 */
public class VisitsDaoImpl implements VisitsDao{

    private EntityManager em = HibernateUtil.getEm();

    private ClientDao clientDao = new ClientDaoImpl();

    /**
     * Save or update count column of visit object
     *
     * @param telegramId
     * @param currentTime
     */
    public void saveOrUpdateCounter(String telegramId, DateTime currentTime) {
        List<Visits> visitsList = findByTelegramId(telegramId);
        boolean foundSameDay = false;
        if (visitsList != null && visitsList.size() > 0) {
            for (Visits visit : visitsList) {
                boolean sameDay = compareDaysOfVisits(visit, currentTime);
                if (sameDay) {
                    visit.setCount(visit.getCount() + 1);
                    update(visit);
                    foundSameDay = true;
                    break;
                }
            }
        }
        if (!foundSameDay) {

            Client client = clientDao.findOrCreateClient(telegramId);

            Visits visit = new Visits();
            visit.setDate(currentTime);
            visit.setClient(client);
            visit.setCount(1L);
            add(visit);
        }
    }

    private boolean compareDaysOfVisits(Visits visit, DateTime currentTime) {
        String databaseDay = visit.getDate().toString("yyyyMMdd");
        String current = currentTime.toString("yyyyMMdd");
        if (current.equals(databaseDay)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Find visit by telegramId and day
     * @param telegramId
     * @param day
     * @return Visits
     */
    public Visits getVisitByTelegramIdAndDay(String telegramId, DateTime day) {
        List<Visits> visitsList = findByTelegramId(telegramId);

        if (visitsList != null && visitsList.size() > 0) {
            for (Visits visit : visitsList) {
                boolean sameDay = compareDaysOfVisits(visit, day);
                if (sameDay) {
                    return visit;
                }
            }
        }
        return null;
    }

    public Visits add(Visits visit) {
        em.getTransaction().begin();
        Visits visitFromDB = em.merge(visit);
        em.getTransaction().commit();
        return visitFromDB;
    }

    public void delete(long id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Visits get(long id) {
        return em.find(Visits.class, id);
    }

    public void update(Visits visits) {
        em.getTransaction().begin();
        em.merge(visits);
        em.getTransaction().commit();
    }

    public List<Visits> findAll() {
        TypedQuery<Visits> namedQuery = em.createNamedQuery("Visits.findAll", Visits.class);
        return namedQuery.getResultList();
    }

    public List<Visits> findByTelegramId(String telegramId) {
        TypedQuery<Visits> namedQuery = em.createNamedQuery("Visits.findByTelegram", Visits.class).setParameter("telegramId", telegramId);
        return namedQuery.getResultList();
    }



}
