package com.booleanuk.core;

public class Car {

    private String colour;
    private Battery battery;
    private RemoteControl remoteControl;
    private int distance;

    public Car(String colour, Battery battery, RemoteControl remoteControl) {
        this.colour = colour;
        this.battery = battery;
        this.remoteControl = remoteControl;
        this.distance = 0;
    }

    public int getBatteryPercentage() {
        return battery.getPercentageRemaining();
    }

    public int getDistance() {
        return distance;
    }

    public void moveForward(int distance) {
        this.distance += distance;
    }
}
