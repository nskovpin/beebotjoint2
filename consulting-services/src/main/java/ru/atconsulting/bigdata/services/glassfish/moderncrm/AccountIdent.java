/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="AccountIdent", propOrder={"objid", "organizationId"})
public class AccountIdent {
    protected String objid;
    protected String organizationId;

    public String getObjid() {
        return this.objid;
    }

    public void setObjid(String value) {
        this.objid = value;
    }

    public String getOrganizationId() {
        return this.organizationId;
    }

    public void setOrganizationId(String value) {
        this.organizationId = value;
    }
}

