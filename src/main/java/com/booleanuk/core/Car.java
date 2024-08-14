package com.booleanuk.core;

public class Car {
    private String color;
    private boolean rechargeableBatteries;
    private int motorPower;
    private int turningWheelMotorPower;
    private int location;
    private int batteryPercentage;

    public Car(String color,boolean rechargeableBatteries, int motorPower, int turningWheelMotorPower, int batteryPercentage) {
        this.color = color;
        this.rechargeableBatteries = rechargeableBatteries;
        this.motorPower = motorPower;
        this.turningWheelMotorPower = turningWheelMotorPower;
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
}
