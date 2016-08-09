package ru.beeline.bigdata.flowmanager.workflow.json.technical;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class Flow {

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty
    private List<Step> steps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public Step findFirstStep(){
        return steps.get(0);
    }

    public Step findStepByName(String stepName) {
        for (Step step : steps) {
            if (step.getName().equals(stepName)) {
                return step;
            }
        }
        return null;
    }


    public Step findPreviousStep(String stepCurrentName) {
        if (stepCurrentName.isEmpty()) {
            return steps.get(0);
        }

        for (Step step : steps) {
            if ((step.getRef() != null && step.getRef().equals(stepCurrentName)) ||
                    (step.getDecisions() != null && iterateDecisions(step, stepCurrentName))) {
                return step;
            }
        }
        return null;
    }

    private boolean iterateDecisions(Step step, String stepCurrentName) {
        for (Decision decision : step.getDecisions()) {
            if (decision.getRef().equals(stepCurrentName)) {
                return true;
            }
        }
        return false;
    }

}
