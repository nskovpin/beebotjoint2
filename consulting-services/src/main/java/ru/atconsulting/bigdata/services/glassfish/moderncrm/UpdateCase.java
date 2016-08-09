/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ActivityInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.LogCaseNotesRequest;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.UpdateCaseRequest;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="UpdateCase", propOrder={"caseId", "updateCaseRequest", "logCaseNotesRequest", "activityInfo"})
public class UpdateCase {
    @XmlElement(required=true)
    protected String caseId;
    protected UpdateCaseRequest updateCaseRequest;
    protected LogCaseNotesRequest logCaseNotesRequest;
    @XmlElement(required=true)
    protected ActivityInfo activityInfo;

    public String getCaseId() {
        return this.caseId;
    }

    public void setCaseId(String value) {
        this.caseId = value;
    }

    public UpdateCaseRequest getUpdateCaseRequest() {
        return this.updateCaseRequest;
    }

    public void setUpdateCaseRequest(UpdateCaseRequest value) {
        this.updateCaseRequest = value;
    }

    public LogCaseNotesRequest getLogCaseNotesRequest() {
        return this.logCaseNotesRequest;
    }

    public void setLogCaseNotesRequest(LogCaseNotesRequest value) {
        this.logCaseNotesRequest = value;
    }

    public ActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    public void setActivityInfo(ActivityInfo value) {
        this.activityInfo = value;
    }
}

