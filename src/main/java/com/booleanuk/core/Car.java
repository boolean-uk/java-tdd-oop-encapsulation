package com.booleanuk.core;

public class Car {

    String colour;
    double distance;
    Battery battery = new Battery();

    public boolean setColour(String newColour) {
        if (newColour.equals("")) {
            return false;
        }
        this.colour = newColour;
        return true;
    }

    public double showBatteryPercentage(double usedBattery) {
        if (usedBattery == 0) {
            return 0.0;
        }
        return battery.size - usedBattery;
    }

    public boolean moveCar(double newDistance, String direction) {
        if (newDistance > 0) {
            if (direction.equals("forward")) {
                this.distance = distance + newDistance;
                return true;
            } else if (direction.equals("backward")) {
                this.distance = distance - newDistance;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean stopCar() {
        return distance > 0;
    }

    public boolean turnCar(String rotation) {
        return rotation.equals("left") || rotation.equals("right");
    }

    public boolean replaceBattery(String kind) {
        if (kind.equals("")) {
            return false;
        }
        battery.typeBattery = kind;
        return true;
    }
}
