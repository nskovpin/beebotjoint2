/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="FinAccountIdent", propOrder={"objid", "crmFaID", "internalFaID", "externalFaID"})
public class FinAccountIdent {
    protected String objid;
    protected String crmFaID;
    protected String internalFaID;
    protected String externalFaID;

    public String getObjid() {
        return this.objid;
    }

    public void setObjid(String value) {
        this.objid = value;
    }

    public String getCrmFaID() {
        return this.crmFaID;
    }

    public void setCrmFaID(String value) {
        this.crmFaID = value;
    }

    public String getInternalFaID() {
        return this.internalFaID;
    }

    public void setInternalFaID(String value) {
        this.internalFaID = value;
    }

    public String getExternalFaID() {
        return this.externalFaID;
    }

    public void setExternalFaID(String value) {
        this.externalFaID = value;
    }
}

