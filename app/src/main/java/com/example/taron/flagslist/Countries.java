package com.example.taron.flagslist;

/**
 * Created by Taron on 05/05/17.
 */

public class Countries {
    private String name;
    private String code;
    private boolean isSelected;

    public Countries(String name, boolean isSelected, String code) {
        this.name = name;
        this.isSelected = isSelected;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
