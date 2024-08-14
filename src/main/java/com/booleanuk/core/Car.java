package com.booleanuk.core;

public class Car {
    private String color;
    private boolean rechargeableBatteries;
    private float motorPower;
    private float turningWheelMotorPower;

    public Car(String color,boolean rechargeableBatteries, float motorPower, float turningWheelMotorPower) {
        this.color = color;
        this.rechargeableBatteries = rechargeableBatteries;
        this.motorPower = motorPower;
        this.turningWheelMotorPower = turningWheelMotorPower;
    }
}
