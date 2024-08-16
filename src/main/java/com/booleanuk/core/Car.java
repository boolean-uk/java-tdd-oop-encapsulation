package com.booleanuk.core;

public class Car {
    public final String colour;
    public final String batteries;
    public final String remotecontrol;
    public final int batterylevel;

    public Car(String colour, String batteries, String remotecontrol) {
        this.batteries = batteries;
        this.colour = colour;
        this.remotecontrol = remotecontrol;
        this.batterylevel = 100;

    }


    public String seeBattery() {
        if (batteries.equals("Rechargable")) {
            return "The battery is rechargable";
        }
        else {
            return "The battery is not rechargable";
        }
    }

    public int moveCarForwardOrBackward(String direction, int distance) {
        if (batteries.equals("Rechargable")) {
            initialBatteryLevel();
           return batterylevel - distance + distance-2;


        }
        initialBatteryLevel();
        return batterylevel - distance;

    }

    public int initialBatteryLevel() {
        return batterylevel;

    }




}






