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
        return "Car moved forward " + metres + " metres";
    }

    public String moveBackward(int metres){
        return "Car moved backward " + metres + " metres";
    }


}
