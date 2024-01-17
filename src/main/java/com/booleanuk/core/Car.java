package com.booleanuk.core;

public class Car {


    private String color;
    private String batteries;
    private String remoteControll;
    private double batteryPercentage;
    private double positionX;
    private double positionY;

    public Car(String color, String batteries) {
        this.color = color;
        this.batteries = batteries;
    }


    public boolean setBatteries(String batteries) {

        if(batteries.equalsIgnoreCase("Rechargable") || batteries.equalsIgnoreCase("Disposable")) {
            this.batteries = batteries;
            return true;
        }


        return false;
    }

    public String getBatteries() {

        return this.batteries;

    }
}
