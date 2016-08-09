import org.junit.Test;
import ru.atconsulting.bigdata.database.dao.impl.ClientDaoImpl;
import ru.atconsulting.bigdata.database.domain.db.user.Client;


import java.util.List;

/**
 * Created by NSkovpin on 02.08.2016.
 */
public class ClientServiceTest {

    ClientDaoImpl userDao = new ClientDaoImpl();

    @Test
    public void saveAndReadTest(){
        String telegramId = "99099";
        Client user = new Client();
        user.setTelegramId(telegramId);
        userDao.add(user);

        Client user1 = userDao.findByTelegramId(telegramId);

        assert user1 != null && user1.getTelegramId().equals(telegramId);

        userDao.delete(user1.getClientId());
    }


}
