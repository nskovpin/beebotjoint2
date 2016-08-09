/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="ContactIdent", propOrder={"objid", "contactID"})
public class ContactIdent {
    protected String objid;
    protected String contactID;

    public String getObjid() {
        return this.objid;
    }

    public void setObjid(String value) {
        this.objid = value;
    }

    public String getContactID() {
        return this.contactID;
    }

    public void setContactID(String value) {
        this.contactID = value;
    }
}

