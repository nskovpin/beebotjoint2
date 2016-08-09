/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="WorkflowInfo", propOrder={"workflowOperation", "workflowTarget"})
public class WorkflowInfo {
    protected String workflowOperation;
    protected String workflowTarget;

    public String getWorkflowOperation() {
        return this.workflowOperation;
    }

    public void setWorkflowOperation(String value) {
        this.workflowOperation = value;
    }

    public String getWorkflowTarget() {
        return this.workflowTarget;
    }

    public void setWorkflowTarget(String value) {
        this.workflowTarget = value;
    }
}

