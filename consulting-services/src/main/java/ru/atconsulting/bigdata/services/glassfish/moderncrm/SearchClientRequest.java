/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="SearchClientRequest", propOrder={"inn"})
public class SearchClientRequest {
    @XmlElement(required=true)
    protected String inn;

    public String getInn() {
        return this.inn;
    }

    public void setInn(String value) {
        this.inn = value;
    }
}

