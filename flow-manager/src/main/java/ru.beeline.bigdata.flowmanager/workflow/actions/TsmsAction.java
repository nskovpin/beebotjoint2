package ru.beeline.bigdata.flowmanager.workflow.actions;

import ru.atconsulting.bigdata.services.*;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;

import java.util.Properties;

/**
 * Created by NSkovpin on 30.06.2016.
 * Get information from tsms
 */

public class TsmsAction implements Action {

    private Step step;

    private String ctn;

    public TsmsAction(Step step, String ctn) {
        this.step = step;
        if (ctn != null && ctn.length() == 10) {
            ctn = "7" + ctn;
        }
        this.ctn = ctn;
    }

    @Override
    public Object run() throws Exception {

        Properties properties = new Properties();
        properties.setProperty(TsmsParams.username.name(), step.getInstruction().getParams().getName());
        properties.setProperty(TsmsParams.password.name(), step.getInstruction().getParams().getPassword());
        properties.setProperty(TsmsParams.url.name(), step.getInstruction().getParams().getUrl());
        properties.setProperty(TsmsParams.ctn.name(), ctn);
        ClientPropertiesImpl clientProperties = new ClientPropertiesImpl(properties);

        ServiceClient serviceClient = new ServiceClientImpl();

        Object object =  serviceClient.getServiceResult(ServicesNamesImpl.LocationService, clientProperties);
        return object;
    }

    @Override
    public Step getStep() {
        return step;
    }

}
