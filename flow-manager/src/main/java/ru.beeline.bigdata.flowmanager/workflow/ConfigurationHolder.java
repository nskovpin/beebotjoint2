package ru.beeline.bigdata.flowmanager.workflow;

import ru.beeline.bigdata.flowmanager.workflow.files.ReasonsHolder;
import ru.beeline.bigdata.flowmanager.workflow.json.FlowHolder;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class ConfigurationHolder {

    private static ConfigurationHolder holderSingleton;

    public static final String CONFIG_FILE_NAME = "application.properties";

    private Properties properties;

    private FlowHolder flowHolder;

    private FlowHolder beginningFlowHolder;

    private ReasonsHolder reasonsHolder;

    private ConfigurationHolder() {
        this.properties = PropertiesLoader.loadAllProperties(getPath(CONFIG_FILE_NAME));

        String beginningFlowDirectoryPath = properties.getProperty(PropertiesLoader.Params.FLOW_DIRECTORY_BEGINNING_PATH.getValue());
        try {
            this.beginningFlowHolder = FlowHolder.getFlowHolderInstance(getPath(beginningFlowDirectoryPath));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while reading beginning flow directory");
        }

        String flowHolderPath = properties.getProperty(PropertiesLoader.Params.FLOW_DIRECTORY_PATH.getValue());
        try {
            this.flowHolder = FlowHolder.getFlowHolderInstance(getPath(flowHolderPath));
        } catch (JAXBException | IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while reading flow directory");
        }

        String reasonsHolderPath = properties.getProperty(PropertiesLoader.Params.REASON_FILE_PATH.getValue());
        try {
            this.reasonsHolder = ReasonsHolder.getReasonsHolderInstance(getPath(reasonsHolderPath));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error while reading reasons file");
        }
    }

    public static ConfigurationHolder getInstance() {
        if(holderSingleton == null){
            holderSingleton = new ConfigurationHolder();
        }
        return holderSingleton;
    }

    public FlowHolder getFlowHolder() {
        return flowHolder;
    }

    public ReasonsHolder getReasonsHolder() {
        return reasonsHolder;
    }

    public void setReasonsHolder(ReasonsHolder reasonsHolder) {
        this.reasonsHolder = reasonsHolder;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public FlowHolder getBeginningFlowHolder(){
        return beginningFlowHolder;
    }

    private String getPath(String resourcePath) {
        URL url = getClass().getClassLoader().getResource(resourcePath);
        if (url != null) {
            return url.getPath();
        }
        return null;
    }


}
