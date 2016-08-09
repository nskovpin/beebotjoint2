/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="GetCaseListRequest", propOrder={"serviceID", "attrName", "caseTypes"})
public class GetCaseListRequest {
    @XmlElement(required=true)
    protected String serviceID;
    protected String attrName;
    protected CaseTypesData caseTypes;

    public String getServiceID() {
        return this.serviceID;
    }

    public void setServiceID(String value) {
        this.serviceID = value;
    }

    public String getAttrName() {
        return this.attrName;
    }

    public void setAttrName(String value) {
        this.attrName = value;
    }

    public CaseTypesData getCaseTypes() {
        return this.caseTypes;
    }

    public void setCaseTypes(CaseTypesData value) {
        this.caseTypes = value;
    }
}

