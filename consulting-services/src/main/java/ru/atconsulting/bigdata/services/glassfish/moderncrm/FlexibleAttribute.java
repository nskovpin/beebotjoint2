/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="FlexibleAttribute", propOrder={"attrName", "attrValue"})
public class FlexibleAttribute {
    @XmlElement(required=true)
    protected String attrName;
    @XmlElement(required=true)
    protected String attrValue;

    public String getAttrName() {
        return this.attrName;
    }

    public void setAttrName(String value) {
        this.attrName = value;
    }

    public String getAttrValue() {
        return this.attrValue;
    }

    public void setAttrValue(String value) {
        this.attrValue = value;
    }
}

