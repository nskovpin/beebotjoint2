/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TopicRequest", propOrder={"reasonCode1", "reasonCode2", "result", "isPrimary"})
public class TopicRequest {
    @XmlElement(required=true)
    protected String reasonCode1;
    @XmlElement(required=true)
    protected String reasonCode2;
    @XmlElement(required=true)
    protected String result;
    protected Boolean isPrimary;

    public String getReasonCode1() {
        return this.reasonCode1;
    }

    public void setReasonCode1(String value) {
        this.reasonCode1 = value;
    }

    public String getReasonCode2() {
        return this.reasonCode2;
    }

    public void setReasonCode2(String value) {
        this.reasonCode2 = value;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String value) {
        this.result = value;
    }

    public Boolean isIsPrimary() {
        return this.isPrimary;
    }

    public void setIsPrimary(Boolean value) {
        this.isPrimary = value;
    }
}

