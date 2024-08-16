package com.booleanuk.core;

public class RemoteControlledCar {
    private String color;
    private double facingDirection = 0; //degrees 0-359

    public RemoteControlledCar(String color){
        this.color = color;
    }

    public void setCarColor(String newColor){
        this.color = newColor;
    }

    public String getCarColor(){
        return this.color;
    }

}
