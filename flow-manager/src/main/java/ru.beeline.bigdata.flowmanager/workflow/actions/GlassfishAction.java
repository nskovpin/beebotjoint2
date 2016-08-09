package ru.beeline.bigdata.flowmanager.workflow.actions;

import ru.atconsulting.bigdata.services.*;
import ru.atconsulting.bigdata.services.glassfish.moderncrm.ObjectFactory;
import ru.beeline.bigdata.flowmanager.workflow.files.ReasonsHolder;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.AdditionalParam;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Step;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by NSkovpin on 20.06.2016.
 * Get information from glassFish
 */
public class GlassfishAction implements Action {

    private Step step;

    private String ctn;

    private List<String> requiredInfoList;

    private Map<String, String> additionalParamsMap;

    private ReasonsHolder reasonsHolder;

    private Object inputObject;

    public GlassfishAction(Step step, String ctn, ReasonsHolder reasonsHolder, Object inputObject) {
        this.step = step;
        this.ctn = ctn;
        this.requiredInfoList = step.getInstruction().getParams().getArgs();

        this.inputObject =inputObject;

        if (step.getInstruction().getParams().getAdditionalParams() != null &&
                step.getInstruction().getParams().getAdditionalParams() != null &&
                step.getInstruction().getParams().getAdditionalParams().size() > 0) {
            additionalParamsMap = new HashMap<>();
            for (AdditionalParam additionalParam : step.getInstruction().getParams().getAdditionalParams()) {
                additionalParamsMap.put(additionalParam.getKey(), additionalParam.getValue());
            }
        }
        this.reasonsHolder = reasonsHolder;
    }

    @Override
    public Object run() throws Exception {

        //set properties for library
        Properties properties = new Properties();
        properties.setProperty(GlassfishParams.name.name(), step.getInstruction().getParams().getName());
        properties.setProperty(GlassfishParams.password.name(), step.getInstruction().getParams().getPassword());
        properties.setProperty(GlassfishParams.url.name(), step.getInstruction().getParams().getUrl());
        properties.setProperty(GlassfishParams.ctn.name(), ctn);

        if(additionalParamsMap != null && additionalParamsMap.size() > 0){
            for (Map.Entry<String,String> additionalParam : additionalParamsMap.entrySet()){
                properties.setProperty(additionalParam.getKey(), additionalParam.getValue());
            }
        }

        ClientPropertiesImpl glassfishClientProperties = new ClientPropertiesImpl(properties);
        glassfishClientProperties.addAdditionalParam(GlassfishParams.list_params.name(), requiredInfoList);

        if(reasonsHolder != null){
            glassfishClientProperties.addAdditionalParam(GlassfishParams.list_reasons.name(), reasonsHolder.getReasonList());
        }

        //if we get a lat, long as input
        if(inputObject instanceof Map){
            properties.setProperty(GlassfishParams.latitude.name(), (String) ((Map) inputObject).get(GlassfishParams.latitude));
            properties.setProperty(GlassfishParams.longitude.name(), (String) ((Map) inputObject).get(GlassfishParams.longitude));
        }

        //using library
        ServiceClient serviceClient = new ServiceClientImpl();

        //send instruction name from step, send properties and get result
        Object response = serviceClient.getServiceResult(ServicesNamesImpl.valueOf(step.getInstruction().getParams().getService()), glassfishClientProperties);
        return response;
    }

    @Override
    public Step getStep() {
        return step;
    }

}
