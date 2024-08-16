package com.booleanuk.core;

public class Car {
    public final String colour;
    public final String batteries;
    public final String remotecontrol;

    public Car(String colour, String batteries, String remotecontrol) {
        this.batteries = batteries;
        this.colour = colour;
        this.remotecontrol = remotecontrol;

    }


    public String seeBattery() {
        if (batteries.equals("Rechargable")) {
            return "The battery is rechargable";
        }
        else {
            return "The battery is not rechargable";
        }
    }


}






