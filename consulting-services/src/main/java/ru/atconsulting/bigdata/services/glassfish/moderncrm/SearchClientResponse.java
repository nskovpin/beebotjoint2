/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="SearchClientResponse", propOrder={"clientID"})
public class SearchClientResponse {
    @XmlElement(required=true)
    protected String clientID;

    public String getClientID() {
        return this.clientID;
    }

    public void setClientID(String value) {
        this.clientID = value;
    }
}

