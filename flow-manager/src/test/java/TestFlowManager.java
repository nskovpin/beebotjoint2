import org.junit.Test;
import ru.beeline.bigdata.flowmanager.FlowManager;

import java.io.IOException;

/**
 * Created by valeriastrizkova on 26/07/16.
 */
public class TestFlowManager {

    @Test
    public void TestAnswers() throws IOException {
        FlowManager flowManager = new FlowManager();
        flowManager.setStep("auth");
        //System.out.println(flowManager.getAnswerChoicesWithParams());
    }
}
