package ru.beeline.bigdata.flowmanager.workflow.json;

import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;
import ru.beeline.bigdata.flowmanager.workflow.utils.JacksonUtils;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class FlowHolder {

    private Map<String, Flow> flowIdAndFlowMap;

    private FlowHolder(){

    }

    public static FlowHolder getFlowHolderInstance(String flowsPath) throws JAXBException, IOException {
        File flowDirectory = new File(flowsPath);
        if (!flowDirectory.isDirectory()) {
            throw new RuntimeException("Set flow path directory!");
        }
        FlowHolder flowHolder = new FlowHolder();
        for (File file : flowDirectory.listFiles()) {
            if (file.isFile()) {

                Flow flow = JacksonUtils.loadObject(file.getPath(), Flow.class);
                flowHolder.addFlowToHolder(flow);
            }
        }
        if (flowHolder.getFlowIdAndFlowMap().size() == 0) {
            throw new RuntimeException("Cant find any flow");
        }
        return flowHolder;
    }

    private void addFlowToHolder(Flow flow) {
        if (flowIdAndFlowMap == null) {
            flowIdAndFlowMap = new HashMap<>();
        }
        flowIdAndFlowMap.put(flow.getId(), flow);
    }

    public Flow getFlowById(String flowId) {
        return flowIdAndFlowMap.get(flowId);
    }

    public Flow getFlowByName(String flowName){
        for(Map.Entry<String, Flow> flowIdAndFlow: flowIdAndFlowMap.entrySet()){
            if(flowIdAndFlow.getValue().getName().equals(flowName)){
                return flowIdAndFlow.getValue();
            }
        }
        return null;
    }

    public Flow getFlowWithSmallestId(){
        String smallest = null;
        for(Map.Entry<String, Flow> flowIdAndFlow: flowIdAndFlowMap.entrySet()){
            if(smallest == null){
                smallest = flowIdAndFlow.getKey();
                continue;
            }

            if(Integer.parseInt(flowIdAndFlow.getValue().getId()) < Integer.parseInt(smallest)){
                smallest = flowIdAndFlow.getValue().getId();
            }
        }

        return flowIdAndFlowMap.get(smallest);
    }

    public void setFlowIdAndFlowMap(Map<String, Flow> flowIdAndFlowMap) {
        this.flowIdAndFlowMap = flowIdAndFlowMap;
    }

    public Map<String, Flow> getFlowIdAndFlowMap() {
        return flowIdAndFlowMap;
    }
}

