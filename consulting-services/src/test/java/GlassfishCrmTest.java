import org.junit.Test;
import ru.atconsulting.bigdata.services.*;
import ru.atconsulting.bigdata.services.glassfish.impl.GlassfishCrmSoapClient;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.*;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.IllegalUsageException_Exception;
import ru.atconsulting.bigdata.services.glassfish.sis.ServiceException;
import ru.atconsulting.bigdata.services.glassfish.trouble.GetTTInfoByCoordinateFault_Exception;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by NSkovpin on 11.07.2016.
 */
public class GlassfishCrmTest {

    @Test
    public void createInteractionTest() {
        String ctn = "895121";
        String name = "CP";
        String password = "CP";
        String url = "http://ms-glass006:4466/CRMOperationsUrl/";
        String reason1 = "NE RABOTAET INTERNET";
        String reason2 = "INT. INTERNET S TELEFONA/PLANSHETA";
        String result = "MASSOVYY INTSIDENT";
        String note = "NOTE";

        GlassfishCrmSoapClient crmSoapClient = new GlassfishCrmSoapClient();

        CreateInteractionResponse createInteractionResponse = null;
        try {
            createInteractionResponse = crmSoapClient.createInteractionResponse(ctn, name, password,url, note, reason1,reason2,result);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (IllegalUsageException_Exception e) {
            e.printStackTrace();
            assert e.getFaultInfo().getMessage().length() > 0;
        } catch (InternalSystemErrorException_Exception e) {
            e.printStackTrace();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        assert createInteractionResponse == null;
    }

    @Test
    public void getLastInteractions() throws InternalSystemErrorException_Exception, DatatypeConfigurationException, DataNotFoundException_Exception, IllegalUsageException_Exception, JAXBException, ServiceException, GetTTInfoByCoordinateFault_Exception {
        String ctn = "9610138780";
        String name = "CP";
        String password = "CP";
        String url = "http://ms-glass004:6743/CRMOperationsUrl/";
        Integer period = 40;

        Properties properties = new Properties();
        properties.setProperty(GlassfishParams.name.name(), name);
        properties.setProperty(GlassfishParams.password.name(), password);
        properties.setProperty(GlassfishParams.url.name(), url);
        properties.setProperty(GlassfishParams.ctn.name(), ctn);
        properties.setProperty(GlassfishParams.period.name(), period.toString());
        ClientPropertiesImpl clientProperties = new ClientPropertiesImpl(properties);

        ServiceClient serviceClient = new ServiceClientImpl();


        Object lastInteractionsResponse =  serviceClient.getServiceResult(ServicesNamesImpl.LastInteractions, clientProperties);
        assert lastInteractionsResponse instanceof Boolean;
    }





}
