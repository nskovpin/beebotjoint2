package ru.beeline.bigdata.flowmanager.workflow.files;

import ru.atconsulting.bigdata.services.glassfish.Reason;

import java.io.IOException;
import java.util.List;

/**
 * Created by NSkovpin on 13.07.2016.
 * Class which contains list of Reason objects
 */
public class ReasonsHolder {

    private List<Reason> reasonList;

    private ReasonsHolder(){
    }

    public static ReasonsHolder getReasonsHolderInstance(String reasonsPath) throws IOException {

        ReasonsHolder reasonsHolder = new ReasonsHolder();

        List<Reason> reasonList = ReasonsMaker.loadReasonsToList(reasonsPath);
        reasonsHolder.setReasonList(reasonList);
        return reasonsHolder;
    }

    public List<Reason> getReasonList() {
        return reasonList;
    }

    public void setReasonList(List<Reason> reasonList) {
        this.reasonList = reasonList;
    }
}
