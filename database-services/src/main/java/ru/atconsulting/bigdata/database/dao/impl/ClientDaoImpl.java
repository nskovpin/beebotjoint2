package ru.atconsulting.bigdata.database.dao.impl;

import ru.atconsulting.bigdata.database.dao.ClientDao;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.atconsulting.bigdata.database.utils.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public class ClientDaoImpl implements ClientDao{

    private EntityManager em = HibernateUtil.getEm();

    public Client add(Client user) {
        em.getTransaction().begin();
        Client userFromDB = em.merge(user);
        em.getTransaction().commit();
        return userFromDB;
    }

    public void delete(long id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Client get(long id) {
        return em.find(Client.class, id);
    }

    public void update(Client user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    public List<Client> findAll() {
        TypedQuery<Client> namedQuery = em.createNamedQuery("Client.findAll", Client.class);
        return namedQuery.getResultList();
    }

    public Client findByTelegramId(String telegramId) {
        TypedQuery<Client> namedQuery = em.createNamedQuery("Client.findByTelegram", Client.class).setParameter("telegramId", telegramId);
        return namedQuery.getSingleResult();
    }

    public Client findOrCreateClient(String telegramId){
        Client client = null;
        try{
            client = findByTelegramId(telegramId);
        }catch (NoResultException e){
            client = new Client();
            client.setTelegramId(telegramId);
            client = add(client);
        }
        return client;
    }

}
