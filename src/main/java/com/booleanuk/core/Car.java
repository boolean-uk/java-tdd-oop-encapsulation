package com.booleanuk.core;

public class Car {
    String colour;
    boolean rechargeable;
    int batteryPercentage;

    public Car (String colour, boolean rechargeable, int batteryPercentage) {
        this.colour = colour;
        this.rechargeable = rechargeable;
        this.batteryPercentage = batteryPercentage;
    }

    public boolean replaceBattery() {
        if (batteryPercentage < 10) {
            System.out.println("The battery has been replaced successfully");
            return true;
        } else {
            System.out.println("The battery percentage is not low enough to be replaced");
            return false;
        }
    }

}
