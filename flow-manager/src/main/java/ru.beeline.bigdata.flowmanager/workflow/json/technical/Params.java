package ru.beeline.bigdata.flowmanager.workflow.json.technical;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by NSkovpin on 20.06.2016.
 */
public class Params {

    private Question question;

    private String name;

    private String password;

    private String service;

    private String url;

    private List<AdditionalParam> additionalParams;

    private List<String> args;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<AdditionalParam> getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(List<AdditionalParam> additionalParams) {
        this.additionalParams = additionalParams;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }
}
