/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateClientResponse", propOrder={"clientID", "clientObjID"})
public class CreateClientResponse {
    @XmlElement(required=true)
    protected String clientID;
    @XmlElement(required=true)
    protected String clientObjID;

    public String getClientID() {
        return this.clientID;
    }

    public void setClientID(String value) {
        this.clientID = value;
    }

    public String getClientObjID() {
        return this.clientObjID;
    }

    public void setClientObjID(String value) {
        this.clientObjID = value;
    }
}

