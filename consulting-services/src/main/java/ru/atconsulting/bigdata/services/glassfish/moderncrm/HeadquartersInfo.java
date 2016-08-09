/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="HeadquartersInfo", propOrder={"branch", "headquartersMarketCode"})
public class HeadquartersInfo {
    @XmlElement(required=true)
    protected String branch;
    @XmlElement(required=true)
    protected String headquartersMarketCode;

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String value) {
        this.branch = value;
    }

    public String getHeadquartersMarketCode() {
        return this.headquartersMarketCode;
    }

    public void setHeadquartersMarketCode(String value) {
        this.headquartersMarketCode = value;
    }
}

