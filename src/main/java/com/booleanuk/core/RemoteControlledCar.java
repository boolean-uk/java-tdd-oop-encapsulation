package com.booleanuk.core;

public class RemoteControlledCar {
    private String color;

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
