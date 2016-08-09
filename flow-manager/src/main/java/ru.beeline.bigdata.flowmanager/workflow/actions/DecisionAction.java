package ru.beeline.bigdata.flowmanager.workflow.actions;

import ru.beeline.bigdata.flowmanager.workflow.json.technical.Decision;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

/**
 * Created by NSkovpin on 04.08.2016.
 */
public class DecisionAction implements Action {

    private Step step;

    private Object input;

    private Flow flow;

    public DecisionAction(Step step, Flow flow, Object input) {
        this.step = step;
        this.flow = flow;
        this.input = input;
    }

    @Override
    public Object run() throws Exception {
        String nextStep = step.makeDecision(input);
        return nextStep;
    }

    @Override
    public Step getStep() {
        return step;
    }

    public void setInput(Object input) {
        this.input = input;
    }
}
