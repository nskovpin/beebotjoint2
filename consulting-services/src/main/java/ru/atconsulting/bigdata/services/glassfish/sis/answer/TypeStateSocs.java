package ru.atconsulting.bigdata.services.glassfish.sis.answer;

import ru.atconsulting.bigdata.services.glassfish.sis.SOC;

import java.io.Serializable;
import java.util.List;

/**
 * Created by NSkovpin on 12.07.2016.
 */
public class TypeStateSocs implements Serializable {

    private String type;

    private List<SOC> soc;

    private String state;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SOC> getSoc() {
        return soc;
    }

    public void setSoc(List<SOC> soc) {
        this.soc = soc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
