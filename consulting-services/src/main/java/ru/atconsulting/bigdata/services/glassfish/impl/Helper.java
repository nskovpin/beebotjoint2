package ru.atconsulting.bigdata.services.glassfish.impl;

import javax.xml.ws.BindingProvider;

/**
 * Created by NSkovpin on 13.07.2016.
 */
public class Helper {

    public static void setProperCredentialsAndUrl(BindingProvider bindingProvider, String glassfishName,
                                            String glassfishPassword, String url) {
        bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, glassfishName);
        bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, glassfishPassword);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
    }

}
