/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="MnpInfo", propOrder={"mnpApplicationID", "mnpClaimID"})
public class MnpInfo {
    protected String mnpApplicationID;
    protected String mnpClaimID;

    public String getMnpApplicationID() {
        return this.mnpApplicationID;
    }

    public void setMnpApplicationID(String value) {
        this.mnpApplicationID = value;
    }

    public String getMnpClaimID() {
        return this.mnpClaimID;
    }

    public void setMnpClaimID(String value) {
        this.mnpClaimID = value;
    }
}

