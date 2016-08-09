package ru.beeline.bigdata.flowmanager;

import java.util.List;

/**
 * Created by valeriastrizkova on 01/08/16.
 */
public class Choices {
    List<Button> buttons;
    boolean oneRow;

    public Choices(List<Button> buttons) {
        this.buttons = buttons;
        oneRow = false;
    }

    public Choices(List<Button> buttons, boolean oneRow) {
        this.buttons = buttons;
        this.oneRow = oneRow;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public boolean isOneRow() {
        return oneRow;
    }
}
