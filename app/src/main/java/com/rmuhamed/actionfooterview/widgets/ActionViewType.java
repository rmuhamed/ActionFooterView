package com.rmuhamed.actionfooterview.widgets;

/**
 * Created by rmuhamed on sábado.
 */

public enum ActionViewType {

    BUTTON("button"),
    IMAGE("image"),
    LABEL("label"),
    EDIT_TEXT("edit_text"),
    NO_TYPE("noType");

    private final String value;

    ActionViewType (String value) {
        this.value = value;
    }

    static public ActionViewType fromName(String value) {
        if (value != null) {
            switch (value) {
                case "button":
                    return BUTTON;
                case "image":
                    return IMAGE;
                case "label":
                    return LABEL;
                case "edit_text":
                    return EDIT_TEXT;
                default:
                    return NO_TYPE;
            }
        } else {
            return NO_TYPE;
        }
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
