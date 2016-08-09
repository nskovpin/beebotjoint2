package ru.beeline.bigdata.flowmanager.workflow.json.technical;


/**
 * Created by NSkovpin on 20.06.2016.
 */
public class Instruction {

    private String name;

    private Params params;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
}
