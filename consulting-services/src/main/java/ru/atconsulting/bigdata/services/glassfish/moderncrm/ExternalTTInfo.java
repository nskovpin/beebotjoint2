/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="ExternalTTInfo", propOrder={"replicateToExternalTT", "externalTTNumber", "externalTTStatus", "externalTTSysCode"})
public class ExternalTTInfo {
    protected Boolean replicateToExternalTT;
    protected String externalTTNumber;
    protected String externalTTStatus;
    @XmlElement(required=true)
    protected String externalTTSysCode;

    public Boolean isReplicateToExternalTT() {
        return this.replicateToExternalTT;
    }

    public void setReplicateToExternalTT(Boolean value) {
        this.replicateToExternalTT = value;
    }

    public String getExternalTTNumber() {
        return this.externalTTNumber;
    }

    public void setExternalTTNumber(String value) {
        this.externalTTNumber = value;
    }

    public String getExternalTTStatus() {
        return this.externalTTStatus;
    }

    public void setExternalTTStatus(String value) {
        this.externalTTStatus = value;
    }

    public String getExternalTTSysCode() {
        return this.externalTTSysCode;
    }

    public void setExternalTTSysCode(String value) {
        this.externalTTSysCode = value;
    }
}

