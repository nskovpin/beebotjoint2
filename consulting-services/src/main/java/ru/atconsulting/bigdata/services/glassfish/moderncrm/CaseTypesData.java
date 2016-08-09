/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CaseTypesData", propOrder={"caseType1", "caseType2", "caseType3"})
public class CaseTypesData {
    @XmlElement(required=true)
    protected String caseType1;
    @XmlElement(required=true)
    protected String caseType2;
    @XmlElement(required=true)
    protected String caseType3;

    public String getCaseType1() {
        return this.caseType1;
    }

    public void setCaseType1(String value) {
        this.caseType1 = value;
    }

    public String getCaseType2() {
        return this.caseType2;
    }

    public void setCaseType2(String value) {
        this.caseType2 = value;
    }

    public String getCaseType3() {
        return this.caseType3;
    }

    public void setCaseType3(String value) {
        this.caseType3 = value;
    }
}

