package com.booleanuk.core;

public class Car {


    private String color;
    private String batteries;
    private String remoteControll;
    private double batteryPercentage;
    private double positionX;
    private double positionY;

    public Car(String color, String batteries, String remoteControll) {
        this.color = color;
        this.batteries = batteries;
        this.remoteControll = remoteControll;
        this.batteryPercentage = 100.00;
        this.positionX = 50.00;
        this.positionY = 50.00;
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

    public String getRemoteControll() {
        return this.remoteControll;
    }

    public boolean setRemoteControll(String remoteControll) {
        if(remoteControll.equalsIgnoreCase("Simple") || remoteControll.equalsIgnoreCase("Advanced")) {
            this.remoteControll = remoteControll;
            return true;
        }

        return false;
    }
}
