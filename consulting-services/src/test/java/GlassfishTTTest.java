import org.junit.Test;
import ru.atconsulting.bigdata.services.glassfish.impl.GlassfishTroubleSoapClient;
import ru.atconsulting.bigdata.services.glassfish.trouble.GetTTInfoByCoordinateFault_Exception;

import javax.xml.datatype.DatatypeConfigurationException;

/**
 * Created by NSkovpin on 13.07.2016.
 */
public class GlassfishTTTest {

    @Test
    public void getTTInfoByCoordinateTest() throws DatatypeConfigurationException, GetTTInfoByCoordinateFault_Exception {
        String name = "CP";
        String password = "CP";
        String url = "http://ms-glass018:5678/CasetoTTGetTT";

        GlassfishTroubleSoapClient glassfishTroubleSoapClient = new GlassfishTroubleSoapClient();
        Boolean ttInd = glassfishTroubleSoapClient.getTroubleIndService(name, password, url, "12.1", "123.1");

        assert  !ttInd;
    }
}
