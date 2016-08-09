/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CaseInfo", propOrder={"caseId", "caseObjid", "title", "creationTime", "closeTime", "condition", "status", "serviceID", "crmFAId", "caseType1", "caseType2", "caseType3", "ownerLogin", "priority", "severity", "flexibleAttribute"})
public class CaseInfo {
    @XmlElement(required=true)
    protected String caseId;
    @XmlElement(required=true)
    protected String caseObjid;
    @XmlElement(required=true)
    protected String title;
    @XmlElement(required=true)
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar closeTime;
    @XmlElement(required=true)
    protected String condition;
    @XmlElement(required=true)
    protected String status;
    protected String serviceID;
    protected String crmFAId;
    @XmlElement(required=true)
    protected CRMObjectData caseType1;
    @XmlElement(required=true)
    protected CRMObjectData caseType2;
    @XmlElement(required=true)
    protected CRMObjectData caseType3;
    @XmlElement(required=true)
    protected String ownerLogin;
    @XmlElement(required=true)
    protected CRMObjectData priority;
    @XmlElement(required=true)
    protected CRMObjectData severity;
    protected FlexibleAttribute flexibleAttribute;

    public String getCaseId() {
        return this.caseId;
    }

    public void setCaseId(String value) {
        this.caseId = value;
    }

    public String getCaseObjid() {
        return this.caseObjid;
    }

    public void setCaseObjid(String value) {
        this.caseObjid = value;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public XMLGregorianCalendar getCreationTime() {
        return this.creationTime;
    }

    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    public XMLGregorianCalendar getCloseTime() {
        return this.closeTime;
    }

    public void setCloseTime(XMLGregorianCalendar value) {
        this.closeTime = value;
    }

    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String value) {
        this.condition = value;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getServiceID() {
        return this.serviceID;
    }

    public void setServiceID(String value) {
        this.serviceID = value;
    }

    public String getCrmFAId() {
        return this.crmFAId;
    }

    public void setCrmFAId(String value) {
        this.crmFAId = value;
    }

    public CRMObjectData getCaseType1() {
        return this.caseType1;
    }

    public void setCaseType1(CRMObjectData value) {
        this.caseType1 = value;
    }

    public CRMObjectData getCaseType2() {
        return this.caseType2;
    }

    public void setCaseType2(CRMObjectData value) {
        this.caseType2 = value;
    }

    public CRMObjectData getCaseType3() {
        return this.caseType3;
    }

    public void setCaseType3(CRMObjectData value) {
        this.caseType3 = value;
    }

    public String getOwnerLogin() {
        return this.ownerLogin;
    }

    public void setOwnerLogin(String value) {
        this.ownerLogin = value;
    }

    public CRMObjectData getPriority() {
        return this.priority;
    }

    public void setPriority(CRMObjectData value) {
        this.priority = value;
    }

    public CRMObjectData getSeverity() {
        return this.severity;
    }

    public void setSeverity(CRMObjectData value) {
        this.severity = value;
    }

    public FlexibleAttribute getFlexibleAttribute() {
        return this.flexibleAttribute;
    }

    public void setFlexibleAttribute(FlexibleAttribute value) {
        this.flexibleAttribute = value;
    }
}

