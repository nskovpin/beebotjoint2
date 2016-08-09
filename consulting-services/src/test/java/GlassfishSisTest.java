import org.junit.Test;
import ru.atconsulting.bigdata.services.*;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException_Exception;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.InternalSystemErrorException_Exception;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DataNotFoundException_Exception;
import ru.atconsulting.bigdata.services.glassfish.sis.Corebalance;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;
import ru.atconsulting.bigdata.services.glassfish.trouble.GetTTInfoByCoordinateFault_Exception;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by NSkovpin on 08.07.2016.
 */
public class GlassfishSisTest {


    @Test
    public void getCorebalanceTest() throws JAXBException, ServiceException, IllegalUsageException_Exception, InternalSystemErrorException_Exception, ru.atconsulting.bigdata.services.glassfish.moderncrm.InternalSystemErrorException_Exception, DatatypeConfigurationException, DataNotFoundException_Exception, GetTTInfoByCoordinateFault_Exception, ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException_Exception {


        Properties properties = new Properties();
        properties.setProperty(GlassfishParams.name.name(), "CP");
        properties.setProperty(GlassfishParams.password.name(), "CP");
        properties.setProperty(GlassfishParams.url.name(), "http://dr-glass016:3460/SubServiceSoap/");
        properties.setProperty(GlassfishParams.ctn.name(), "9610138780");
        ClientPropertiesImpl glassfishClientProperties = new ClientPropertiesImpl(properties);
        glassfishClientProperties.addAdditionalParam(GlassfishParams.list_params.name(), Arrays.asList("corebalance"));

        ServiceClient serviceClient = new ServiceClientImpl();

        Object response = serviceClient.getServiceResult(ServicesNamesImpl.SubscriberCoreBalance, glassfishClientProperties);

        assert response instanceof Corebalance;
        assert ((Corebalance)response).getBalanceAmount()!= null;

    }




}
