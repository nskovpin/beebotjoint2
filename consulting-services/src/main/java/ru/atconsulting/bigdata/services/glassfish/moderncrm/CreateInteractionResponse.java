/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CreateInteractionResponse", propOrder={"interactionId"})
public class CreateInteractionResponse {
    @XmlElement(required=true)
    protected String interactionId;

    public String getInteractionId() {
        return this.interactionId;
    }

    public void setInteractionId(String value) {
        this.interactionId = value;
    }
}

