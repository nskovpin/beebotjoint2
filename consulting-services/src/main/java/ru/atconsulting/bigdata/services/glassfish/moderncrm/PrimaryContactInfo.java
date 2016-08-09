/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.DocumentInfo;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="PrimaryContactInfo", propOrder={"firstName", "lastName", "middleName", "birthdate", "documentInfo"})
public class PrimaryContactInfo {
    protected String firstName;
    protected String lastName;
    protected String middleName;
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar birthdate;
    protected DocumentInfo documentInfo;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String value) {
        this.middleName = value;
    }

    public XMLGregorianCalendar getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    public DocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

    public void setDocumentInfo(DocumentInfo value) {
        this.documentInfo = value;
    }
}

