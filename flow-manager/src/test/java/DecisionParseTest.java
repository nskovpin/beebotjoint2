import org.junit.Before;
import org.junit.Test;
import ru.atconsulting.bigdata.services.glassfish.sis.Interacts;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Decision;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NSkovpin on 05.08.2016.
 */
public class DecisionParseTest {

    @Test
    public void checkEquals(){

        Step step = new Step();

        List<Decision> decisionList = new ArrayList<>();

        Decision decision1 = new Decision();
        decision1.setCondition("equals");
        decision1.setValue("HELLO");
        decision1.setRef("step2");

        Decision decision2 = new Decision();
        decision2.setCondition("equals");
        decision2.setValue("BYE");
        decision2.setRef("step3");

        decisionList.add(decision1);
        decisionList.add(decision2);

        step.setDecisions(decisionList);

        String next = step.makeDecision(new String("BYE"));
        assert next.equals("step3");
    }


    @Test
    public void checkIs(){

        Step step = new Step();

        List<Decision> decisionList = new ArrayList<>();

        Decision decision1 = new Decision();
        decision1.setCondition("is");
        decision1.setValue("true");
        decision1.setRef("step2");

        Decision decision2 = new Decision();
        decision2.setCondition("is");
        decision2.setValue("false");
        decision2.setRef("step3");

        decisionList.add(decision1);
        decisionList.add(decision2);

        step.setDecisions(decisionList);

        String next = step.makeDecision(new Boolean(false));
        assert next.equals("step3");
    }


    @Test
    public void checkGreaterLower(){

        Step step = new Step();

        List<Decision> decisionList = new ArrayList<>();

        Decision decision1 = new Decision();
        decision1.setCondition(">");
        decision1.setValue("10");
        decision1.setRef("step2");

        Decision decision2 = new Decision();
        decision2.setCondition("<");
        decision2.setValue("10");
        decision2.setRef("step3");

        decisionList.add(decision1);
        decisionList.add(decision2);

        step.setDecisions(decisionList);

        String next = step.makeDecision(14);
        assert next.equals("step2");

        String next2 = step.makeDecision(7);
        assert next2.equals("step3");
    }

    @Test
    public void parseDoubleTest(){

        Double testDouble1 = Decision.getDoubleValue(22);
        Double testDouble2 = Decision.getDoubleValue(223.12);
        Double testDouble3 = Decision.getDoubleValue((byte) 12);
        Double testDouble4 = Decision.getDoubleValue("dsf");

        assert testDouble1 != null && testDouble2 != null && testDouble3 != null;
        assert testDouble4 == null;

        String value1 = "123.123";
        Object value2 = 123.123;

        String value3 = "123";
        Object value4 = new Integer("123");

        Double d1 = Decision.parseStringToDouble(value1);
        Double d2 = Decision.getDoubleValue(value2);

        Double d3 = Decision.parseStringToDouble(value3);
        Double d4 = Decision.getDoubleValue(value4);

        assert d1 != null && d2 != null;
        assert d1.doubleValue() == d2.doubleValue();

        assert d3 != null && d4 != null;
        assert d3.doubleValue() == d4.doubleValue();

        System.out.println();
    }

}
