import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;
import ru.atconsulting.bigdata.database.dao.ClientDao;
import ru.atconsulting.bigdata.database.dao.impl.ClientDaoImpl;
import ru.atconsulting.bigdata.database.dao.impl.LogsDaoImpl;
import ru.atconsulting.bigdata.database.domain.db.logs.Log;
import ru.atconsulting.bigdata.database.domain.db.user.Client;

import java.util.AbstractSequentialList;
import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public class LogServiceTest {

    ClientDaoImpl clientDao = new ClientDaoImpl();

    LogsDaoImpl logsDao = new LogsDaoImpl();

    @Test
    public void saveAndReadLogTest(){

        String telegramId = "889";

        Client client = new Client();
        client.setTelegramId(telegramId);

        clientDao.add(client);

        Client clientFromDb = clientDao.findByTelegramId(telegramId);

        Log log = new Log();
        log.setText("Error log");
        log.setAdditional("Operator");
        log.setClient(clientFromDb);
        log.setDate(DateTime.parse("20160714", DateTimeFormat.forPattern("yyyyMMdd")));

        logsDao.add(log);

        List<Log> logList = logsDao.findByTelegramId(telegramId);

        assert logList != null && logList.size() > 0;

        for(Log l : logList){
            logsDao.delete(l.getLogId());
        }

        clientDao.delete(clientFromDb.getClientId());
    }

    @Test
    public void findByAdditionalTest(){
        String telegramId = "889";

        Client client = new Client();
        client.setTelegramId(telegramId);

        clientDao.add(client);

        Client clientFromDb = clientDao.findByTelegramId(telegramId);

        Log log = new Log();
        log.setText("Error log");
        log.setAdditional("Operator");
        log.setClient(clientFromDb);
        log.setDate(DateTime.parse("20160714", DateTimeFormat.forPattern("yyyyMMdd")));

        Log log2 = new Log();
        log2.setText("Error log");
        log2.setAdditional("Ne opera");
        log2.setClient(clientFromDb);
        log2.setDate(DateTime.parse("20160714", DateTimeFormat.forPattern("yyyyMMdd")));

        logsDao.add(log);
        logsDao.add(log2);

        List<Log> logList = logsDao.findByTelegramIdAndAdditionalLike(telegramId, "Operator");

        assert  logList.get(0).getAdditional().equals("Operator");
    }

    @Test
    public void getLogsByDayTest(){
        String telegramId = "889";

        Client client = new Client();
        client.setTelegramId(telegramId);

        clientDao.add(client);

        Client clientFromDb = clientDao.findByTelegramId(telegramId);

        Log log = new Log();
        log.setText("Error log");
        log.setAdditional("Operator");
        log.setClient(clientFromDb);
        log.setDate(DateTime.parse("20160714", DateTimeFormat.forPattern("yyyyMMdd")));

        Log log2 = new Log();
        log2.setText("Error log");
        log2.setAdditional("Ne opera");
        log2.setClient(clientFromDb);
        log2.setDate(DateTime.parse("20160715", DateTimeFormat.forPattern("yyyyMMdd")));

        logsDao.add(log);
        logsDao.add(log2);

        List<Log> logList = logsDao.getLogsByTelegramIdAndDay(telegramId,DateTime.parse("20160714", DateTimeFormat.forPattern("yyyyMMdd")) );

        assert  logList.size() > 0  && logList.get(0).getDate().toString("yyyyMMdd").equals("20160714");
    }

}
