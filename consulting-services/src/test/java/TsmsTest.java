import org.junit.Test;
import ru.atconsulting.bigdata.services.*;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DataNotFoundException_Exception;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException_Exception;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.InternalSystemErrorException_Exception;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;
import ru.atconsulting.bigdata.services.glassfish.trouble.GetTTInfoByCoordinateFault_Exception;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Properties;

/**
 * Created by NSkovpin on 08.07.2016.
 */
public class TsmsTest {


    @Test
    public void getTokenAndLocationTest() throws JAXBException, ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception, ru.atconsulting.bigdata.services.glassfish.moderncrm.InternalSystemErrorException_Exception, DatatypeConfigurationException, DataNotFoundException_Exception, GetTTInfoByCoordinateFault_Exception, ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException_Exception {


        Properties properties = new Properties();
        properties.setProperty(TsmsParams.username.name(), "BOT");
        properties.setProperty(TsmsParams.password.name(), "123456aA");
        properties.setProperty(TsmsParams.url.name(), "http://192.168.151.139//smsw/apiv3.php");
        properties.setProperty(TsmsParams.ctn.name(), "7955332");
        ClientPropertiesImpl clientProperties = new ClientPropertiesImpl(properties);

        ServiceClient serviceClient = new ServiceClientImpl();


        Object object =  serviceClient.getServiceResult(ServicesNamesImpl.LocationService, clientProperties);
        assert object != null;
        assert object instanceof Boolean;

    }


}
