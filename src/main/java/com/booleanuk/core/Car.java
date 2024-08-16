package com.booleanuk.core;

import java.rmi.Remote;

public class Car {
    private String color;
    private Battery battery;
    private RemoteControl remoteControl;


    public Car(String color, Battery battery, RemoteControl remoteControl){
        this.color = color;
        this.battery = battery;
        this.remoteControl = remoteControl;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }

    public Battery getBattery(){
        return this.battery;
    }

    public RemoteControl getRemoteControl(){
        return this.remoteControl;
    }

    public String moveForward(int metres){
        if (canMove(metres)){
            for (int i = 0; i < metres; i++){
                this.battery.setRemainingBatteryPercentage(this.battery.getRemainingBatteryPercentage()-1);
            }
            return "Car moved forward " + metres + " metres";
        }

        else return "Battery percentage too low to move this far";
    }

    public String moveBackward(int metres){
        if (canMove(metres)){
            for (int i = 0; i < metres; i++){
                this.battery.setRemainingBatteryPercentage(this.battery.getRemainingBatteryPercentage()-1);
            }
            return "Car moved backwards " + metres + " metres";
        }

        else return "Battery percentage too low to move this far";
    }


    public boolean canMove(int metres){
        return battery.getRemainingBatteryPercentage() <= metres;
    }



    public String stop(){
        return "Car has stopped.";
    }

    public String turnLeft(){
        return "Turning left.";
    }

    public String turnRight(){
        return "Turning right.";
    }

    public void changeBattery(Battery newBattery){
        this.battery = newBattery;
    }
}
