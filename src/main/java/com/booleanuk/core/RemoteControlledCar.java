package com.booleanuk.core;

public class RemoteControlledCar {

    public String carName = "Ferrari";
    public String carModel = "2020";


    //User Story 1
    public String chooseCarColor(String color) {
        return "New car color: " + color + ".";
    }

    //User Story 4
    public String chooseCarRemoteControl(String remoteControlType) {
        return "Chosen remote control type: " + remoteControlType + ".";
    }

    //User Story 5

}
