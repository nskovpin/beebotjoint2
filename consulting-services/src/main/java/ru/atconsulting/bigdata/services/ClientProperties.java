package ru.atconsulting.bigdata.services;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by NSkovpin on 15.06.2016.
 */
public interface ClientProperties {

    Properties getProperties();

    String getProperty(String propertyName);

    Map<String, ? super Collection> getAdditionalParams();

    void addAdditionalParam(String paramName, Collection collection);

}
