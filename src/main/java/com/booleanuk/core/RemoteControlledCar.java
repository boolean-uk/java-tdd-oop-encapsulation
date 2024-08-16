package com.booleanuk.core;

public class RemoteControlledCar {
    String carColour = "Red";
    boolean advancedRemote = false;
    double currentXCoord = 0;
    double currentYCoord = 0;
    boolean movingCar = false;
    Battery battery = new Battery();


    public void moveCar (double xDistance , double yDistance){
        this.movingCar = true;
        this.currentXCoord += xDistance;
        this.currentYCoord += yDistance;
    }


    public void stopCar(){
        this.movingCar = false;
    }


    public void switchRemoteType (){
        if(advancedRemote){
            advancedRemote = false;
        }else{
            advancedRemote = true;
        }
    }
    public void changeCarColour(String newColour){
        this.carColour = newColour;
    }



}
