package ru.atconsulting.bigdata.services.tsms.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by NSkovpin on 05.07.2016.
 */
@XmlRootElement(name = "token")
@XmlAccessorType(XmlAccessType.FIELD)
public class Token {

    @XmlValue
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
