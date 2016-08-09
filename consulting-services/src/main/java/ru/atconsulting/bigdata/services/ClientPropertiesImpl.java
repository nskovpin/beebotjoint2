package ru.atconsulting.bigdata.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by NSkovpin on 14.07.2016.
 */
public class ClientPropertiesImpl implements ClientProperties {

    private Properties properties;

    private Map<String, ? super Collection> additionalParams = new HashMap<String, Collection>();

    public ClientPropertiesImpl(Properties properties){
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

    public Map<String, ? super Collection> getAdditionalParams() {
        return additionalParams;
    }

    public void addAdditionalParam(String paramName, Collection collection) {
        additionalParams.put(paramName, collection);
    }

    public void setAdditionalParams(Map<String, Object> additionalParams) {
        this.additionalParams = additionalParams;
    }
}
