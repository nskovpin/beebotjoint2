import org.junit.Test;
import ru.beeline.bigdata.flowmanager.workflow.ConfigurationHolder;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

import java.util.List;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class MakeDecisionTest {


    @Test
    public void makeDecisionTest(){
        ConfigurationHolder configurationHolder = ConfigurationHolder.getInstance();
        int countDecisions = 0;

        List<Step> stepList = configurationHolder.getFlowHolder().getFlowById("1").getSteps();
        for (Step step : stepList){
            if(step.getDecisions()!= null && step.getInstruction().getName().equals("DECISION_BOT")){
                countDecisions ++;
                String decision = step.makeDecision(step.getDecisions().get(0).getValue());
                assert decision != null;
                break;
            }
        }
        assert countDecisions != 0;
    }



}
