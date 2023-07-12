package com.booleanuk.core;

public class RemoteControlledCar {
    String color;
    Battery battery;
    String remoteControl;

    public String stop(){
        return "Car stopped";
    }

    public String turn(String direction){
        return "Turned " + direction;
    }

    public String replaceBattery(Battery newBattery){
        battery = newBattery;
        return "Battery replaced to: " + battery.toString();
    }
}
