package com.booleanuk.core;

public class Car {

    private static final float DEFAULT_BATTERY_PERCENT = 100;

    private String color;
    private boolean rechargable = true;
    private boolean controlType = true;
    private float batteryPercent = DEFAULT_BATTERY_PERCENT;

    private float speed;

    public Car() {
        this.color = "white";
        this.speed =0;
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

    public void switchChargingType() {
        this.rechargable = !this.rechargable;
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


    public void addSpeed(float num ){
        this.speed += num;
    }
    public void slowDown(float num ){
        this.speed = this.speed - num < 0 ? 0 : this.speed - num;
    }

    public float getSpeed() {
        return speed;
    }
}
