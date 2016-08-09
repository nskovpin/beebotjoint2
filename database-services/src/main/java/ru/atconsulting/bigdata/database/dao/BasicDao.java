package ru.atconsulting.bigdata.database.dao;

import ru.atconsulting.bigdata.database.domain.db.user.Client;

import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public interface BasicDao<T> {

    T add(T obj);

    void delete(long id);

    List<T> findAll();

}
