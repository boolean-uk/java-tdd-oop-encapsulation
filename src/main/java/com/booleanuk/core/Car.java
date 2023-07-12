package com.booleanuk.core;

public class Car {
    private Colour colour;
    private Battery battery;
    private ControlType controlType;

    public Car(Colour colour, Battery battery, ControlType controlType) {
        this.colour = colour;
        this.battery = battery;
        this.controlType = controlType;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public ControlType getControlType() {
        return controlType;
    }

    public void setControlType(ControlType controlType) {
        this.controlType = controlType;
    }

    public void changeBattery(Battery battery) {
        this.battery = battery;
    }
}
