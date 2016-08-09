package ru.atconsulting.bigdata.services.glassfish.impl;


import ru.atconsulting.bigdata.services.ClientProperties;
import ru.atconsulting.bigdata.services.ServiceClient;
import ru.atconsulting.bigdata.services.ServicesNames;
import ru.atconsulting.bigdata.services.glassfish.sis.*;
import ru.atconsulting.bigdata.services.glassfish.sis.answer.TypeStateSocs;

import javax.xml.bind.JAXBException;
import javax.xml.ws.BindingProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by NSkovpin on 08.06.2016.
 */
public class GlassfishSisSoapClient {


    public Corebalance getCoreBalance(String ctn, String glassfishName,
                                      String glassfishPassword, String url) throws ServiceException {
        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);
        Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
        requiredInfo.setValue(RequiredInfo.COREBALANCE);
        request.getRequiredInfo().add(requiredInfo);

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        Helper.setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, url);
        Response response = subscribeInfo.subscribeInfo(request);
        return response.getCorebalance();
    }

    public Response getType(String ctn, String glassfishName, String glassfishPassword, String url) throws ServiceException {
        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);
        Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
        requiredInfo.setValue(RequiredInfo.TYPE);
        request.getRequiredInfo().add(requiredInfo);

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        Helper.setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, url);
        return subscribeInfo.subscribeInfo(request);
    }

    public Boolean getTypeService(String ctn, String glassfishName, String glassfishPassword, String url) throws ServiceException {
        Response response = getType(ctn,glassfishName, glassfishPassword, url);
        if (response.getType() != null && response.getType().length() > 0) {
            if (response.getType().equals("Prepaid")) {
                return true;
            } else if (response.getType().equals("Postpaid")) {
                return false;
            }
        }
        throw new RuntimeException("Response with type is Null");
    }

    public SOCs getSocs(String ctn, String glassfishName,
                        String glassfishPassword, String url) throws ServiceException {
        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);
        Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
        requiredInfo.setValue(RequiredInfo.SOC);
        requiredInfo.setExt("fast");
        request.getRequiredInfo().add(requiredInfo);

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        Helper.setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, url);
        Response response = subscribeInfo.subscribeInfo(request);
        return response.getSOCs();
    }

    public TypeStateSocs getTypeStateSocsService(String ctn, String glassfishName,
                                          String glassfishPassword, String url) throws ServiceException{
        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);
        Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
        requiredInfo.setValue(RequiredInfo.SOC);
        requiredInfo.setExt("fast");
        requiredInfo.setValue(RequiredInfo.STATE);
        requiredInfo.setValue(RequiredInfo.TYPE);
        request.getRequiredInfo().add(requiredInfo);

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        Helper.setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, url);
        Response response = subscribeInfo.subscribeInfo(request);

        TypeStateSocs typeStateSocs = new TypeStateSocs();
        typeStateSocs.setSoc(response.getSoc());
        typeStateSocs.setState(response.getState());
        typeStateSocs.setType(response.getType());
        return typeStateSocs;
    }

    public Response getSubscriberInfoResponse(String glassfishName, String glassfishPassword, String glassfishUrl,
                                              String ctn, List<String> requiredInfoValues) throws ServiceException {
        if (ctn.isEmpty()) {
            throw new RuntimeException("Ctn is empty");
        }

        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        Request request = objectFactory.createRequest();
        request.setCtn(ctn);


        for (String requiredInfoValue : requiredInfoValues) {
            Request.RequiredInfo requiredInfo = objectFactory.createRequestRequiredInfo();
            RequiredInfo requiredInfoEnumValue = RequiredInfo.fromValue(requiredInfoValue);
            requiredInfo.setValue(requiredInfoEnumValue);
            request.getRequiredInfo().add(requiredInfo);
        }

        SubscribeInfo subscribeInfo = subscriberInfoService.getSubscribeInfoBindingPort();
        Helper.setProperCredentialsAndUrl((BindingProvider) subscribeInfo,
                glassfishName, glassfishPassword, glassfishUrl);
        Response response = subscribeInfo.subscribeInfo(request);
        return response;
    }

    public ResponseDebt getSubscriberDebtResponse(String glassfishName, String glassfishPassword, String glassfishUrl,
                                                  String ctn, List<String> requiredInfoValues) throws ServiceException {
        if (ctn.isEmpty()) {
            throw new RuntimeException("Ctn is empty");
        }

        SubscriberInfoService subscriberInfoService = new SubscriberInfoService();
        ObjectFactory objectFactory = new ObjectFactory();
        RequestDebt request = objectFactory.createRequestDebt();
        request.setCtn(ctn);

        SubscriberDebt subscriberDebt = subscriberInfoService.getSubscriberDebtBindingPort();
        Helper.setProperCredentialsAndUrl((BindingProvider) subscriberDebt,
                glassfishName, glassfishPassword, glassfishUrl);
        ResponseDebt response = subscriberDebt.subscriberDebt(request);
        return response;
    }


}
