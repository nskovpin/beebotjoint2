import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;
import ru.atconsulting.bigdata.database.dao.impl.ClientDaoImpl;
import ru.atconsulting.bigdata.database.dao.impl.VisitsDaoImpl;
import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by NSkovpin on 01.08.2016.
 */
public class VisitsServicesTest {

    VisitsDaoImpl visitsDao = new VisitsDaoImpl();

    ClientDaoImpl clientDao = new ClientDaoImpl();

    @Test
    public void saveVisitTest() {
        String telegramId = "111111";

        Client client =  clientDao.findOrCreateClient(telegramId);

        Visits visit1 = new Visits();
        visit1.setClient(client);
        visit1.setDate(DateTime.parse("20160114", DateTimeFormat.forPattern("yyyyMMdd")));
        visit1.setCount(2L);

        visitsDao.add(visit1);

        List<Visits> visitsList = visitsDao.findByTelegramId(telegramId);
        assert visitsList != null && visitsList.size() > 0;

        List<Visits> visitsList1 = visitsDao.findByTelegramId(telegramId);
        for (Visits visit : visitsList1) {
            visitsDao.delete(visit.getVisitId());
        }

        clientDao.delete(client.getClientId());
    }

    @Test
    public void deleteVisitTest() {
        String telegramId = "55555";

        Client client = clientDao.findOrCreateClient(telegramId);

        Visits visit1 = new Visits();
        visit1.setClient(client);
        visit1.setDate(DateTime.parse("20160114", DateTimeFormat.forPattern("yyyyMMdd")));
        visit1.setCount(1L);

        visitsDao.add(visit1);

        List<Visits> visitsList = visitsDao.findByTelegramId(telegramId);
        assert visitsList != null && visitsList.size() == 1;

        visitsDao.delete(visitsList.get(0).getVisitId());

        List<Visits> visitsList1 = visitsDao.findByTelegramId(telegramId);
        assert visitsList1 == null || visitsList1.size() == 0;

        List<Visits> visitsList2 = visitsDao.findByTelegramId(telegramId);
        for (Visits visit : visitsList2) {
            visitsDao.delete(visit.getVisitId());
        }
        clientDao.delete(client.getClientId());
    }

    @Test
    public void updateVisitTest() {
        String telegramId = "66666";

        Client client =  clientDao.findOrCreateClient(telegramId);

        Visits visit1 = new Visits();
        visit1.setClient(client);
        visit1.setDate(DateTime.parse("20160111", DateTimeFormat.forPattern("yyyyMMdd")));
        visit1.setCount(1L);

        visitsDao.add(visit1);

        List<Visits> visitsList = visitsDao.findByTelegramId(telegramId);

        for (Visits visit : visitsList) {
            assert visit.getCount() == 1L;
            visit.setCount(3L);
            visitsDao.update(visit);
        }

        List<Visits> visitsList1 = visitsDao.findByTelegramId(telegramId);
        for (Visits visit : visitsList1) {
            assert visit.getCount() == 3L;
            visitsDao.delete(visit.getVisitId());
        }

        clientDao.delete(client.getClientId());
    }

    @Test
    public void getAllVisitsTest() {
        String telegramId = "123";

        Client client =  clientDao.findOrCreateClient(telegramId);

        Visits visit1 = new Visits();
        visit1.setClient(client);
        visit1.setDate(DateTime.parse("20160101", DateTimeFormat.forPattern("yyyyMMdd")));
        visit1.setCount(1L);

        Visits visit2 = new Visits();
        visit2.setClient(client);
        visit2.setDate(DateTime.parse("20160102", DateTimeFormat.forPattern("yyyyMMdd")));
        visit2.setCount(1L);

        //Сохраняем
        visitsDao.add(visit1);
        visitsDao.add(visit2);

        //Получаем все с БД
        List<Visits> visitsAll = visitsDao.findAll();

        assert visitsAll != null && visitsAll.size() > 1;

        List<Visits> visitsList1 = visitsDao.findByTelegramId(telegramId);
        for (Visits visit : visitsList1) {
            visitsDao.delete(visit.getVisitId());
        }
        clientDao.delete(client.getClientId());

    }

    @Test
    public void updateCounterTest() {
        String telegramId = "77777";

        Visits visit1 = new Visits();

        Client client =  clientDao.findOrCreateClient(telegramId);

        visit1.setClient(client);
        visit1.setDate(DateTime.parse("20160111", DateTimeFormat.forPattern("yyyyMMdd")));
        visit1.setCount(1L);

        visitsDao.add(visit1);

        visitsDao.saveOrUpdateCounter(telegramId, DateTime.parse("20160111", DateTimeFormat.forPattern("yyyyMMdd")));

        List<Visits> visitsList = visitsDao.findByTelegramId(telegramId);

        for (Visits visit : visitsList) {
            assert visit.getCount() > 1L;
        }

        List<Visits> visitsList1 = visitsDao.findByTelegramId(telegramId);
        for (Visits visit : visitsList1) {
            visitsDao.delete(visit.getVisitId());
        }
        clientDao.delete(client.getClientId());
    }


}
