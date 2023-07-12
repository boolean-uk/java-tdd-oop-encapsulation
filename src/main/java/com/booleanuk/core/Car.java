package com.booleanuk.core;

public class Car {

    private String color;
    private boolean rechargable = true;
    private boolean controlType = true;

    public Car() {
        this.color = "white";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getRechargable() {
        return rechargable;
    }

    public void setRechargable(boolean rechargable) {
        this.rechargable = rechargable;
    }

    public boolean getRemoteControl() {
        return controlType;
    }

    public void setControlType(boolean controlType) {
        this.controlType = controlType;

    }

}
