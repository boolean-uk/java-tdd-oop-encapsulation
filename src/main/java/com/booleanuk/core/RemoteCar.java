package com.booleanuk.core;

public class RemoteCar {
    String battery;
    int batteryCharge;
    String color;
    String controlType;

    public RemoteCar(String battery, String color, String controlType) {
        this.battery = battery;
        this.color = color;
        this.batteryCharge=100;
        this.controlType = controlType;
    }

    public boolean changeCar(String color) {
        if(!this.color.equals(color)) {
            this.color = color;
            return true;
        }
        return false;
    }

    public boolean chooseBattery(String battery) {
        if(battery.equals("rechargable")||battery.equals("disposable")) {
            this.battery = battery;
            return true;
        }
        return false;
    }

}
