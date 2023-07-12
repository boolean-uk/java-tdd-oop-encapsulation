package com.booleanuk.core;

public class Car {
    private String colour;
    private BatteryType battery;
    private int batteryPercentage;
    private RemoteType remote;
    private int distanceFromStart;
    private String direction;

    public Car(String colour, BatteryType battery, RemoteType remote) {
        this.colour = colour;
        this.battery = battery;
        this.batteryPercentage = 100;
        this.remote = remote;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public BatteryType getBattery() {
        return battery;
    }

    public void setBattery(BatteryType battery) {
        this.battery = battery;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public int getDistance() {
        return distanceFromStart;
    }

    public RemoteType getRemote() {
        return remote;
    }

    public void setRemote(RemoteType remote) {
        this.remote = remote;
    }


    public String getDirection() {
        return direction;
    }


    public void moveForward(int meters) {
        this.distanceFromStart += meters;
        System.out.println("Car moved forward by: " + meters + "meters. Total distance: " + this.distanceFromStart + "meters.");

    }

    public void moveBackward(int meters) {
        this.distanceFromStart += meters;
        System.out.println("Car moved backward by: " + meters + "meters. Total distance: " + this.distanceFromStart + "meters.");

    }

    public boolean stop() {
        System.out.println("Car stopped");
        return true;
    }

    public void turnLeft() {
        this.direction = "Left";
        System.out.println("Car turned left");
    }
    public void turnRight() {
        this.direction = "Right";
        System.out.println("Car turned right");
    }
}
