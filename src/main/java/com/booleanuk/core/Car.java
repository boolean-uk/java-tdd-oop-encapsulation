package com.booleanuk.core;

public class Car {

    private String colour;
    private boolean rechargableBattery;
    private boolean simpleControl;
    private int batteryLevel;
    private int positionY;
    private boolean moving;
    private String direction;

    Car(String colour, boolean rechargableBattery, boolean simpleControl){
        this.colour = colour;
        this.rechargableBattery = rechargableBattery;
        this.simpleControl = simpleControl;
        this.batteryLevel = 100;
        this.positionY = 0;
        this.moving = false;
        this.direction = "vertical";
    }

    public int move(int i){
        positionY += i;
        return positionY;
    }

}
