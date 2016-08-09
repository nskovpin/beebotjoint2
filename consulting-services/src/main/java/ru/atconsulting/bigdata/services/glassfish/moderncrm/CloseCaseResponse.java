/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CloseCaseResponse", propOrder={"result"})
public class CloseCaseResponse {
    @XmlElement(required=true)
    protected String result;

    public String getResult() {
        return this.result;
    }

    public void setResult(String value) {
        this.result = value;
    }
}

