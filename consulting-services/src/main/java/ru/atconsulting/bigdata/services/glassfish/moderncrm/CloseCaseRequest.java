/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CloseCaseRequest", propOrder={"caseId", "caseResolution", "caseResolutionNotes", "caseStatus", "responceToCustomer"})
public class CloseCaseRequest {
    @XmlElement(required=true)
    protected String caseId;
    protected String caseResolution;
    protected String caseResolutionNotes;
    protected String caseStatus;
    protected String responceToCustomer;

    public String getCaseId() {
        return this.caseId;
    }

    public void setCaseId(String value) {
        this.caseId = value;
    }

    public String getCaseResolution() {
        return this.caseResolution;
    }

    public void setCaseResolution(String value) {
        this.caseResolution = value;
    }

    public String getCaseResolutionNotes() {
        return this.caseResolutionNotes;
    }

    public void setCaseResolutionNotes(String value) {
        this.caseResolutionNotes = value;
    }

    public String getCaseStatus() {
        return this.caseStatus;
    }

    public void setCaseStatus(String value) {
        this.caseStatus = value;
    }

    public String getResponceToCustomer() {
        return this.responceToCustomer;
    }

    public void setResponceToCustomer(String value) {
        this.responceToCustomer = value;
    }
}

