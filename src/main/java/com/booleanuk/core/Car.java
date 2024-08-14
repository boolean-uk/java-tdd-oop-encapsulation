package com.booleanuk.core;

public class Car {
    private String color;
    private boolean rechargeableBatteries;
    private int motorPower;
    private int turningWheelMotorPower;
    private int location;

    public Car(String color,boolean rechargeableBatteries, int motorPower, int turningWheelMotorPower) {
        this.color = color;
        this.rechargeableBatteries = rechargeableBatteries;
        this.motorPower = motorPower;
        this.turningWheelMotorPower = turningWheelMotorPower;
        location = 0;
    }
}
