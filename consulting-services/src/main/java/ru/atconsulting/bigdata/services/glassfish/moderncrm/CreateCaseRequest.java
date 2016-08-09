/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.AccountIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ContactIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ExternalTTInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.FinAccountIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.FlexibleAttribute;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.MnpInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.NotificationInfo;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ServiceIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.SiteIdent;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.WorkflowInfo;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateCaseRequest", propOrder={"reporterContactIdent", "reporterAccountIdent", "reporterServiceIdent", "reporterFinAccountIdent", "reporterScalaIdent", "flexibleAttributes", "externalTTInfo", "workflowInfo", "notificationInfo", "mnpInfo", "caseTitle", "caseTypeLevel1", "caseTypeLevel2", "caseTypeLevel3", "severity", "priority", "status", "parentChild", "parentCaseID", "phoneNote", "caseNote", "contactName", "address", "caseTerritory"})
public class CreateCaseRequest {
    protected ContactIdent reporterContactIdent;
    protected AccountIdent reporterAccountIdent;
    protected ServiceIdent reporterServiceIdent;
    protected FinAccountIdent reporterFinAccountIdent;
    protected String reporterScalaIdent;
    protected List<FlexibleAttribute> flexibleAttributes;
    protected ExternalTTInfo externalTTInfo;
    protected WorkflowInfo workflowInfo;
    protected NotificationInfo notificationInfo;
    protected MnpInfo mnpInfo;
    @XmlElement(required=true)
    protected String caseTitle;
    @XmlElement(required=true)
    protected String caseTypeLevel1;
    protected String caseTypeLevel2;
    protected String caseTypeLevel3;
    protected String severity;
    protected String priority;
    protected String status;
    protected String parentChild;
    protected String parentCaseID;
    protected String phoneNote;
    protected String caseNote;
    protected String contactName;
    protected String address;
    protected SiteIdent caseTerritory;

    public ContactIdent getReporterContactIdent() {
        return this.reporterContactIdent;
    }

    public void setReporterContactIdent(ContactIdent value) {
        this.reporterContactIdent = value;
    }

    public AccountIdent getReporterAccountIdent() {
        return this.reporterAccountIdent;
    }

    public void setReporterAccountIdent(AccountIdent value) {
        this.reporterAccountIdent = value;
    }

    public ServiceIdent getReporterServiceIdent() {
        return this.reporterServiceIdent;
    }

    public void setReporterServiceIdent(ServiceIdent value) {
        this.reporterServiceIdent = value;
    }

    public FinAccountIdent getReporterFinAccountIdent() {
        return this.reporterFinAccountIdent;
    }

    public void setReporterFinAccountIdent(FinAccountIdent value) {
        this.reporterFinAccountIdent = value;
    }

    public String getReporterScalaIdent() {
        return this.reporterScalaIdent;
    }

    public void setReporterScalaIdent(String value) {
        this.reporterScalaIdent = value;
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

    public MnpInfo getMnpInfo() {
        return this.mnpInfo;
    }

    public void setMnpInfo(MnpInfo value) {
        this.mnpInfo = value;
    }

    public String getCaseTitle() {
        return this.caseTitle;
    }

    public void setCaseTitle(String value) {
        this.caseTitle = value;
    }

    public String getCaseTypeLevel1() {
        return this.caseTypeLevel1;
    }

    public void setCaseTypeLevel1(String value) {
        this.caseTypeLevel1 = value;
    }

    public String getCaseTypeLevel2() {
        return this.caseTypeLevel2;
    }

    public void setCaseTypeLevel2(String value) {
        this.caseTypeLevel2 = value;
    }

    public String getCaseTypeLevel3() {
        return this.caseTypeLevel3;
    }

    public void setCaseTypeLevel3(String value) {
        this.caseTypeLevel3 = value;
    }

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

    public String getParentChild() {
        return this.parentChild;
    }

    public void setParentChild(String value) {
        this.parentChild = value;
    }

    public String getParentCaseID() {
        return this.parentCaseID;
    }

    public void setParentCaseID(String value) {
        this.parentCaseID = value;
    }

    public String getPhoneNote() {
        return this.phoneNote;
    }

    public void setPhoneNote(String value) {
        this.phoneNote = value;
    }

    public String getCaseNote() {
        return this.caseNote;
    }

    public void setCaseNote(String value) {
        this.caseNote = value;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String value) {
        this.contactName = value;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

    public SiteIdent getCaseTerritory() {
        return this.caseTerritory;
    }

    public void setCaseTerritory(SiteIdent value) {
        this.caseTerritory = value;
    }
}

