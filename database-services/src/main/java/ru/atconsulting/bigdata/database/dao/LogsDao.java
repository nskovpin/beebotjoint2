package ru.atconsulting.bigdata.database.dao;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.domain.db.logs.Log;

import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public interface LogsDao extends BasicDao<Log> {

    List<Log> findByTelegramId(String telegramId);

    List<Log> findByTelegramIdAndAdditionalLike(String telegramId, String additional);

    List<Log> getLogsByTelegramIdAndDay(String telegramId, DateTime day);

    void update(Log log);
}
