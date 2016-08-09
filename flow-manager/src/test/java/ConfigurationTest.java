import org.junit.Test;
import ru.beeline.bigdata.flowmanager.workflow.ConfigurationHolder;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class ConfigurationTest {

    @Test
    public void parseFlowTest(){
        ConfigurationHolder configurationHolder = ConfigurationHolder.getInstance();

        assert configurationHolder.getFlowHolder().getFlowById("1") != null;
        assert configurationHolder.getProperties().size() > 0;
        assert configurationHolder.getReasonsHolder().getReasonList().size() > 0;
    }


}
