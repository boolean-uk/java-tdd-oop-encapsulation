package com.booleanuk.core;

public class Car {
    private String color;
    private boolean rechargeableBatteries;
    private int motorPower;
    private int wheelDegree;
    private int location;
    private int batteryPercentage;

    public Car(String color,boolean rechargeableBatteries, int motorPower, int wheelDegree, int batteryPercentage) {
        this.color = color;
        this.rechargeableBatteries = rechargeableBatteries;
        this.motorPower = motorPower;
        this.wheelDegree = wheelDegree;
        this.batteryPercentage = batteryPercentage;
        location = 0;
    }

    public int getLocation() {
        return location;
    }

    public void runCar(int time) {
        location += motorPower * time;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public int getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }

    public int getWheelDegree() {
        return wheelDegree;
    }

    public void setWheelDegree(int wheelDegree) {
        this.wheelDegree = wheelDegree;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRechargeableBatteries(boolean rechargeableBatteries) {
        this.rechargeableBatteries = rechargeableBatteries;
    }

    public boolean getRechargeableBatteries() {
        return rechargeableBatteries;
    }
}
