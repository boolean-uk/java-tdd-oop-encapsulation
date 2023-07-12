package com.booleanuk.core;

public class Car {

    private static final float DEFAULT_BATTERY_PERCENT = 100;

    private String color;
    private boolean rechargable = true;
    private boolean controlType = true;
    private float batteryPercent = DEFAULT_BATTERY_PERCENT;

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

    public float getBatteryPercent() {
        return batteryPercent;
    }

    public void setBatteryPercent(float batteryPercent) {
        this.batteryPercent = batteryPercent;
    }

}
