/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CRMObjectData", propOrder={"title", "refId"})
public class CRMObjectData {
    @XmlElement(required=true)
    protected String title;
    @XmlElement(required=true)
    protected String refId;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getRefId() {
        return this.refId;
    }

    public void setRefId(String value) {
        this.refId = value;
    }
}

