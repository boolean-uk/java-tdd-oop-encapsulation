package com.booleanuk.core;

public class Battery {

    String typeBattery;
    double size = 90.5;

    public boolean setBattery(String newTypeBattery) {
        if (newTypeBattery.equals("rechargeable") || newTypeBattery.equals("disposable")) {
            this.typeBattery = newTypeBattery;
            return true;
        }
        return false;
    }
}
