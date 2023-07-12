package com.booleanuk.core;

import org.junit.jupiter.api.Test;

public class RemoteCarTest {
    public static void main(String[] args) {
        RemoteCar car = new RemoteCar();

        // I want to be able to decide on the colour of the car.
        car.setColor("Red");

        // I want to be able to choose between rechargeable and disposable batteries.
        Battery battery = new Battery("Rechargeable");

        //I want to be able to see the battery percentage remaining
        battery.setPercentageRemaining(50);
        car.setBattery(battery);

        int batteryPercentage = car.getBatteryPercentage();
        System.out.println("Battery percentage: " + batteryPercentage);

        // I want to choose between a simple and an advanced remote control.
        RemoteControl remoteControl = new RemoteControl("Advanced");
        car.setRemoteControl(remoteControl);

        // I want to be able to move the car forward and backward a specific distance
        car.moveForward(10);
        car.moveBackward(5);
        //I want to be able to stop the car from moving.
        car.stop();

        // I want to be able to turn the car left and right.
        car.turnLeft();
        car.turnRight();

        // I want to be able to replace the battery with either kind as needed.
        Battery newBattery = new Battery("Disposable");
        car.replaceBattery(newBattery);
    }
}
