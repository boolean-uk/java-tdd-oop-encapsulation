package com.booleanuk.core;

public class Car {

    String color;
    Battery battery;
    ControlType controlType;


    public void changeColor(String color) {
        this.color = color;
    }

    public Car(String color, Battery battery, ControlType controlType) {
        this.color = color;
        this.battery = battery;
        this.controlType = controlType;
    }

    public String getColor() {
        return color;
    }

    public Battery getBattery() {
        return battery;
    }

    public ControlType getControlType() {
        return controlType;
    }

    public void choseBattery(BatteryType batteryType) {
        battery.setBatteryType(batteryType);
    }

    public void choseControl(ControlType controlType ){
        this.controlType = controlType;

    }

}
