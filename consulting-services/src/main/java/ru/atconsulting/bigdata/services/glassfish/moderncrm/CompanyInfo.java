/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="CompanyInfo", propOrder={"companyName", "trademark", "shortName", "category", "characterization", "organisationForm", "okved"})
public class CompanyInfo {
    protected String companyName;
    protected String trademark;
    protected String shortName;
    protected String category;
    protected String characterization;
    protected String organisationForm;
    protected String okved;

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
    }

    public String getTrademark() {
        return this.trademark;
    }

    public void setTrademark(String value) {
        this.trademark = value;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String value) {
        this.shortName = value;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String value) {
        this.category = value;
    }

    public String getCharacterization() {
        return this.characterization;
    }

    public void setCharacterization(String value) {
        this.characterization = value;
    }

    public String getOrganisationForm() {
        return this.organisationForm;
    }

    public void setOrganisationForm(String value) {
        this.organisationForm = value;
    }

    public String getOkved() {
        return this.okved;
    }

    public void setOkved(String value) {
        this.okved = value;
    }
}

