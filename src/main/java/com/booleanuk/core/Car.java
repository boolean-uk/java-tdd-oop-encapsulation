package com.booleanuk.core;
public class Car {
    public String chooseColour(String colour) {
        return colour;
    }
    public String chooseBattery(String battery) {
        return battery;
    }
    public String chooseRemoteControl(String remoteControl) {
        return remoteControl;
    }
    public double seeBatteryPercentage(double batteryPercentage) {
        return batteryPercentage;
    }
    public String move(String direction, int distance) {
        return "Move " + direction + " for " + distance + " meters";
    }
}