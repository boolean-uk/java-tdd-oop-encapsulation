package com.booleanuk.core;

public class Car {
    private boolean isRechargeable;
    private int batteryLevel;

    public Car() {
        this.batteryLevel = 100;
    }

    public Car(boolean isRechargeable) {
        this.batteryLevel = 100;
        this.isRechargeable = isRechargeable;
    }

    public String move(char direction, int distance) {
        if(this.batteryLevel == 0)
            return "Car is out of fuel";
        if(direction != 'f' && direction != 'b')
            return "Invalid direction";
        String fullDirection = direction == 'f' ? "forward" : "backwards";
        if(this.batteryLevel < distance * 5) {
            int moved = this.batteryLevel / 5;
            this.batteryLevel = 0;
            return "Car moved " + fullDirection + " by " + moved + "km";
        }
        this.batteryLevel -= distance * 5;
        return "Car moved " + fullDirection + " by " + distance + "km";
    }

    public String showBatteryLevel() {
        return "Battery:  " + this.batteryLevel + "%";
    }

    public String changeBattery() {
        return this.isRechargeable ? "Recharged the battery" : "Changed the battery";
    }
}
