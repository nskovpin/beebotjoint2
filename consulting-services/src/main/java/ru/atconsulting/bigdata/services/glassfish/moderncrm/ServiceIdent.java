/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="ServiceIdent", propOrder={"objid", "serviceID", "billingID"})
public class ServiceIdent {
    protected String objid;
    protected String serviceID;
    protected String billingID;

    public String getObjid() {
        return this.objid;
    }

    public void setObjid(String value) {
        this.objid = value;
    }

    public String getServiceID() {
        return this.serviceID;
    }

    public void setServiceID(String value) {
        this.serviceID = value;
    }

    public String getBillingID() {
        return this.billingID;
    }

    public void setBillingID(String value) {
        this.billingID = value;
    }
}

