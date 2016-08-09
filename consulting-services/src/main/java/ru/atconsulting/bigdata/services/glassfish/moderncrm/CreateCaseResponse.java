/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateCaseResponse", propOrder={"caseId", "caseObjid"})
public class CreateCaseResponse {
    @XmlElement(required=true)
    protected String caseId;
    @XmlElement(required=true)
    protected String caseObjid;

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
}

