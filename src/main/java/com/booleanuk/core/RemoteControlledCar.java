package com.booleanuk.core;

public class RemoteControlledCar {
    String color;
    Battery battery;
    String remoteControl;

    public RemoteControlledCar() {
        this.color = "red";
        this.battery = new Battery("rechargable", 100);
        this.remoteControl = "simple";
    }

    public RemoteControlledCar(String color, Battery battery, String remoteControl) {
        this.color = color;
        this.battery = battery;
        this.remoteControl = remoteControl;
    }

    public String setColor(String color) {
        return "";
    }
}
