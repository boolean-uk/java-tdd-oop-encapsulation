package com.booleanuk.core;

public class RCCar {

    public String colour;
    public String rcType;
    public double currentSpeed;
    public double currentTurnAngle;
    public String batteryType;
    public double batteryPercentage;

    public RCCar(String colour, String rcType, String batteryType) {
        this.colour = colour;
        this.rcType = rcType;
        this.currentSpeed = 0;
        this.currentTurnAngle = 0;
        this.batteryType = batteryType;
        this.batteryPercentage = 1.0;
    }

    public String changeRCSetting(String setting) {
        this.rcType = setting;
        return this.rcType;
    }

    public double moveForward(Double input) {
        this.currentSpeed += input;
        return this.currentSpeed;
    }

    public double moveBackwards(Double input) {
        this.currentSpeed -= input;
        return this.currentSpeed;
    }

    public double turnLeft(Double angle) {
        this.currentTurnAngle = angle;
        return this.currentTurnAngle;
    }

    public double turnRight(Double angle) {
        this.currentTurnAngle = angle;
        return this.currentTurnAngle;
    }

    public double stop() {
        this.currentSpeed = 0;
        return this.currentSpeed;
    }

    public String replaceBattery(String newBattery) {
        this.batteryType = newBattery;
        return this.batteryType;
    }

    public void setBatteryPercentage(double batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
