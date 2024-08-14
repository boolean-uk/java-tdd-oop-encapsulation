package com.booleanuk.core;

public class Controller {
    private boolean advanced;
    private int batteryPercentage;

    public Controller(boolean advanced, int batteryPercentage) {
        this.advanced = advanced;
        this.batteryPercentage = batteryPercentage;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }
}
