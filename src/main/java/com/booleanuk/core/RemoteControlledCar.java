package com.booleanuk.core;

public class RemoteControlledCar {
    String color;
    Battery battery;
    String remoteControl;

    public RemoteControlledCar() {
        this.color = "red";
        this.battery = new Battery("rechargeable", 100);
        this.remoteControl = "simple";
    }

    public String setColor(String color) {
        this.color = color;
        return "Changed color to: " + color;
    }

    public String setRemoteControl(String remoteControl) {
        this.remoteControl = remoteControl;
        return "Changed remote control to: " + remoteControl;
    }

    public String moveForward(double distance) {
        return "Moving forward for: " + distance + "m";
    }
}
