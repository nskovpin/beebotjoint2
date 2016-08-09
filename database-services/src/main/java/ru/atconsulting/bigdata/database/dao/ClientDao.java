package ru.atconsulting.bigdata.database.dao;

import ru.atconsulting.bigdata.database.domain.db.user.Client;

import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public interface ClientDao extends BasicDao<Client>{

    Client findByTelegramId(String telegramId);

    void update(Client obj);

    Client get(long id);

    Client findOrCreateClient(String telegramId);

}
