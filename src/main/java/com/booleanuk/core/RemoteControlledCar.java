package com.booleanuk.core;

public class RemoteControlledCar {
   String color;
   String battery;
   String remoteControl;
   int batteryPercentage;
   int distance;

    public RemoteControlledCar(String color, String battery, String remoteControl, int batteryPercentage, int distance) {
        this.color = color;
        this.battery = battery;
        this.remoteControl = remoteControl;
        this.batteryPercentage = batteryPercentage;
        this.distance = distance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getRemoteControl() {
        return remoteControl;
    }

    public void setRemoteControl(String remoteControl) {
        this.remoteControl = remoteControl;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
