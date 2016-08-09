package ru.beeline.bigdata.flowmanager;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by valeriastrizkova on 01/08/16.
 */
public class FlowManager {

    private String step;
    private Map<String, JSONObject> nameToJsonObjectMap;

    private String STARTSTATE = "start";

    public FlowManager() {
        URL url = getClass().getClassLoader().getResource("flow/flow1_internet_problems.json");
        String jsonStr = null;
        try {
            jsonStr = new String(Files.readAllBytes(Paths.get(url.getPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JSONArray jsonArr = (JSONArray) (new JSONObject(jsonStr)).get("steps");
        nameToJsonObjectMap = new HashMap<String, JSONObject>();

        for(int i = 0; i < jsonArr.length(); i++) {
            JSONObject item = jsonArr.getJSONObject(i);
            String name = item.getString("name");
            nameToJsonObjectMap.put(name, item);
        }

        startSession();
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public void startSession() {

        step = STARTSTATE;
    }

    public JSONObject getCurrentJsonObject() {
        return nameToJsonObjectMap.get(step);
    }

    public String nextStep(String message) {
        if (hasChooseAnswer()) {
            JSONArray choices = getSubNodeArray("a", "choices");
            for (Object choice : choices) {
                String text = ((JSONObject) choice).getString("text");
                if (message.equals(text)) {
                    step = ((JSONObject) choice).getString("ref");
                }
            }
            return this.step;
        } else if (hasInputAnswer()) {
            this.step = getSubNode("a", "ref");
            return this.step;
        } else {
            return null;
        }
    }

    private String getSubNode(String node, String subNode) {
        return ((JSONObject) getCurrentJsonObject().get(node)).getString(subNode);
    }

    String getSubSubNode(String node, String subNode, String subSubNode) {
        return ((JSONObject) ((JSONObject) getCurrentJsonObject().get(node)).get(subNode)).getString(subSubNode);
    }

    public Boolean hasStaticQeustion() {
        return getNodeType("q").equals("static");
    }

    public Boolean hasDynamicQeustion() {
        return getNodeType("q").equals("dynamic");
    }

    public boolean hasChooseAnswer() {
        return getNodeType("a").equals("choose");
    }

    public boolean hasInputAnswer() {
        return getNodeType("a").equals("input");
    }

    String getNodeType(String node) {
        return ((JSONObject)getCurrentJsonObject().get(node)).getString("type");
    }

    public String getQuestion() {
        return ((JSONObject) getCurrentJsonObject().get("q")).getString("text");
    }

    public String getQuestionConstructor() {
        return ((JSONObject) getCurrentJsonObject().get("q")).getString("constructor");
    }

    private boolean hasNodeObject(String node) {
        return getCurrentJsonObject().has(node);
    }

    private boolean hasSubNodeObject(String node, String subNode) {
        if (hasNodeObject(node)) {
            return ((JSONObject) getCurrentJsonObject().get(node)).has(subNode);
        } else {
            return false;
        }
    }

    private JSONArray getSubNodeArray(String node, String subNode) {
        if (hasSubNodeObject(node, subNode)) {
            return (JSONArray) ((JSONObject) getCurrentJsonObject().get(node)).get(subNode);
        } else {
            return null;
        }
    }

    private String getParams(JSONObject object) {
        String paramString = "";

        if ((object).has("params")) {
            JSONArray params = (JSONArray) object.get("params");
            for (Object param : params) {
                paramString = paramString + param + ":";
            }

            paramString = paramString.substring(0, paramString.length() - 1);
        }

        return paramString;
    }

    public Choices getAnswerChoices() {

        List<Button> buttons = new ArrayList<Button>();
        JSONArray choicesJson = getSubNodeArray("a", "choices");

        if (choicesJson != null) {
            for (Object choice : choicesJson) {
                String text = ((JSONObject) choice).getString("text");
                boolean location = false;
                String paramString = getParams((JSONObject) choice);
                if (paramString.contains("location")) {
                    location = true;
                }

                Button button = new Button(text, location);
                buttons.add(button);
            }
        } else {
            return null;
        }

        Choices choices = new Choices(buttons);
        return choices;
    }

    public String getChoiceParams() {
        if (hasNodeObject("a")) {
            return getParams((JSONObject) getCurrentJsonObject().get("a"));
        } else {
            return null;
        }
    }
}
