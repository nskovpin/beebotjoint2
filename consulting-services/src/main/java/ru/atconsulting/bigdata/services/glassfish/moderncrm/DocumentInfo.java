/*
 * Decompiled with CFR 0_115.
 */
package ru.atconsulting.bigdata.services.glassfish.moderncrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="DocumentInfo", propOrder={"documentType", "documentSeries", "documentID", "documentIssueDate", "documentIssuerName"})
public class DocumentInfo {
    @XmlElement(required=true)
    protected String documentType;
    @XmlElement(required=true)
    protected String documentSeries;
    protected String documentID;
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar documentIssueDate;
    protected String documentIssuerName;

    public String getDocumentType() {
        return this.documentType;
    }

    public void setDocumentType(String value) {
        this.documentType = value;
    }

    public String getDocumentSeries() {
        return this.documentSeries;
    }

    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    public String getDocumentID() {
        return this.documentID;
    }

    public void setDocumentID(String value) {
        this.documentID = value;
    }

    public XMLGregorianCalendar getDocumentIssueDate() {
        return this.documentIssueDate;
    }

    public void setDocumentIssueDate(XMLGregorianCalendar value) {
        this.documentIssueDate = value;
    }

    public String getDocumentIssuerName() {
        return this.documentIssuerName;
    }

    public void setDocumentIssuerName(String value) {
        this.documentIssuerName = value;
    }
}

