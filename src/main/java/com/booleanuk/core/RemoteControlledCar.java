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

    public double getDirectionInDegrees(){
        return facingDirection;
    }

    public double turnDirectionToRight(double degree){
        facingDirection += degree;
        facingDirection = facingDirection % 360;
        return facingDirection;
    }


    public double turnDirectionToLeft(double degree){
        facingDirection += (360 - degree);
        facingDirection = facingDirection % 360;
        return facingDirection;
    }
}
