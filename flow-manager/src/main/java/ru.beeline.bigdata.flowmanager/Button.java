package ru.beeline.bigdata.flowmanager;

/**
 * Created by valeriastrizkova on 01/08/16.
 */
public class Button {
    String name;
    boolean location;

    public Button(String name) {
        this.name = name;
        this.location = false;
    }

    public Button(String name, boolean location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public boolean isLocation() {
        return location;
    }
}
