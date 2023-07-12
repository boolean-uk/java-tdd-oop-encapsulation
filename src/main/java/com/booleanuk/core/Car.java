package com.booleanuk.core;

public class Car {
    private String color;
    private boolean isBatteryRechargable;
    private boolean isAdvanced;
    private int batteryPercentage;
    private int[] location;

    public boolean changeColor(String color) {
        this.color = color;
        return this.color.equals(color);
    }

    public boolean chooseBattery(boolean isRechargable) {
        isBatteryRechargable = isRechargable;
        return isBatteryRechargable == isRechargable;
    }

    public boolean chooseControlType(boolean isAdvanced) {
        this.isAdvanced = isAdvanced;
        return this.isAdvanced == isAdvanced;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public int[] moveCar(boolean forward, int distance) {
        location[0] = forward ? location[0] + distance : location[0] - distance;
        return location;
    }

    public boolean stopCar() {
        return true;
    }

    public boolean turnCar(boolean left) {
        location[1] = left ? -1 : 1;
        return true;
    }

    public boolean replaceBattery(boolean isRechargable) {
        this.isBatteryRechargable = isRechargable;
        return isBatteryRechargable == isRechargable;
    }
}
