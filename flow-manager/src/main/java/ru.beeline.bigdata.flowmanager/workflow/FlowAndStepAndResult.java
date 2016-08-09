package ru.beeline.bigdata.flowmanager.workflow;

import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

/**
 * Created by NSkovpin on 04.08.2016.
 */
public class FlowAndStepAndResult {

    private Flow flow;

    private Step stepToProcess;

    private Object previousStepResult;

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }

    public Step getStepToProcess() {
        return stepToProcess;
    }

    public void setStepToProcess(Step stepToProcess) {
        this.stepToProcess = stepToProcess;
    }

    public Object getPreviousStepResult() {
        return previousStepResult;
    }

    public void setPreviousStepResult(Object previousStepResult) {
        this.previousStepResult = previousStepResult;
    }
}
