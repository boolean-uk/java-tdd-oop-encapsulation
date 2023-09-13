package com.booleanuk.core;

public class Car {

    public String colour;
    public Battery battery;
    public RemoteControl remoteControl;

    public Battery newBattery;

    public Car() {}

    public Car(String colour, Battery battery, RemoteControl remoteControl) {
        this.colour = colour;
        this.battery = battery;
        this.remoteControl = remoteControl;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public int getBatteryRemainingPercentage() {
        return battery.getRemainingPercentage();
    }
    public boolean moveForward(int distance) {
        return true;
    }

    public boolean moveBackwards(int distance) {
        return true;
    }

    public boolean stop() {
        return true;
    }

    public boolean turnRight() {
        return true;
    }

    public boolean turnLeft() {
        return true;
    }

    public void replaceBattery(Battery newBattery) {
        setBattery(newBattery);
    }


}
