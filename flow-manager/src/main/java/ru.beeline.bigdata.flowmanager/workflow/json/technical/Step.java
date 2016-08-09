package ru.beeline.bigdata.flowmanager.workflow.json.technical;

import java.util.List;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class Step {

    private String name;

    private String type;

    private Instruction instruction;

    private List<Decision> decisions;

    private String ref;

    private String error;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instruction getInstruction() {
        return instruction;
    }

    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    public List<Decision> getDecisions() {
        return decisions;
    }

    public void setDecisions(List<Decision> decisions) {
        this.decisions = decisions;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String makeDecision(Object input){
        for (Decision decision : decisions){
            String nextRef = decision.checkCondition(input);
            if(nextRef != null){
                return nextRef;
            }
        }
        return null;
    }
}
