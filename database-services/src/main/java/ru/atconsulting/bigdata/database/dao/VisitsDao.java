package ru.atconsulting.bigdata.database.dao;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;

import java.util.List;

/**
 * Created by NSkovpin on 01.08.2016.
 */
public interface VisitsDao extends BasicDao<Visits>{


    List<Visits> findByTelegramId(String telegramId);

    void update(Visits visit);

    void saveOrUpdateCounter(String telegramId, DateTime currentTime);

    Visits getVisitByTelegramIdAndDay(String telegramId, DateTime day);

}
