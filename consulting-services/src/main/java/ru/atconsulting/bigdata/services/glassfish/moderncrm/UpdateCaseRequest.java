/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ExternalTTInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.FlexibleAttribute;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.NotificationInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SiteIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.WorkflowInfo;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="UpdateCaseRequest", propOrder={"severity", "priority", "status", "creditNoteNumber", "flexibleAttributes", "externalTTInfo", "workflowInfo", "notificationInfo", "caseTerritory"})
public class UpdateCaseRequest {
    protected String severity;
    protected String priority;
    protected String status;
    protected Long creditNoteNumber;
    protected List<FlexibleAttribute> flexibleAttributes;
    protected ExternalTTInfo externalTTInfo;
    protected WorkflowInfo workflowInfo;
    protected NotificationInfo notificationInfo;
    protected SiteIdent caseTerritory;

    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String value) {
        this.severity = value;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String value) {
        this.priority = value;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public Long getCreditNoteNumber() {
        return this.creditNoteNumber;
    }

    public void setCreditNoteNumber(Long value) {
        this.creditNoteNumber = value;
    }

    public List<FlexibleAttribute> getFlexibleAttributes() {
        if (this.flexibleAttributes == null) {
            this.flexibleAttributes = new ArrayList<FlexibleAttribute>();
        }
        return this.flexibleAttributes;
    }

    public ExternalTTInfo getExternalTTInfo() {
        return this.externalTTInfo;
    }

    public void setExternalTTInfo(ExternalTTInfo value) {
        this.externalTTInfo = value;
    }

    public WorkflowInfo getWorkflowInfo() {
        return this.workflowInfo;
    }

    public void setWorkflowInfo(WorkflowInfo value) {
        this.workflowInfo = value;
    }

    public NotificationInfo getNotificationInfo() {
        return this.notificationInfo;
    }

    public void setNotificationInfo(NotificationInfo value) {
        this.notificationInfo = value;
    }

    public SiteIdent getCaseTerritory() {
        return this.caseTerritory;
    }

    public void setCaseTerritory(SiteIdent value) {
        this.caseTerritory = value;
    }
}

