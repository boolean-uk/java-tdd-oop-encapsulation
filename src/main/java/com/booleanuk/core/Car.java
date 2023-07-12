package com.booleanuk.core;

public class Car {
    String colour;
    Battery battery;
    RemoteController controller;

    public Car(Battery battery, RemoteController controller,String colour ) {
        this.colour = colour;
        this.battery = battery;
        this.controller = controller;
    }

    public String getColour() {
        return colour;
    }

    public void changeColour(String colour) {
        this.colour = colour;
    }

    public int batteryChargeStatus() {
        return this.battery.getChargeStatus();
    }
}
