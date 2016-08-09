package ru.beeline.bigdata.flowmanager.workflow.actions;


import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

/**
 * Created by NSkovpin on 20.06.2016.
 * For running instructions
 */
public interface Action {

    Object run() throws Exception;

    Step getStep();

}
