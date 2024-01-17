package com.booleanuk.core;

public class RCCar {

    public String colour;
    public String rcType;
    public double currentSpeed;
    public String batteryType;
    public double batteryPercentage;

    public RCCar(String colour, String rcType, String batteryType) {
        this.colour = colour;
        this.rcType = rcType;
        this.currentSpeed = 0;
        this.batteryType = batteryType;
        this.batteryPercentage = 1.0;
    }

    public String changeRCSetting(String setting) {
        this.rcType = setting;
        return this.rcType;
    }

    public double moveForward(Double input) {
        return 0.0;
    }

    public double moveBackwards(Double input) {
        return 0.0;
    }

    public double turnLeft(Double input) {
        return 0.0;
    }

    public double turnRight(Double input) {
        return 0.0;
    }

    public double stop() {
        return 0.0;
    }

    public String replaceBattery(String newBattery) {
        return "";
    }

    public void setBatteryPercentage(double batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
