package com.booleanuk.core;

public class RemoteControlledCarBattery {

    //User Story 2
    public String chooseCarBattery(String batteryType) {
        return "Chosen car batter: " + batteryType + ".";
    }

    //User Story 4
    public String showBatteryPercentage(int batteryPercentage) {
        int defaultBatteryPercentage = 100;

        int remainingBatteryPercentage = defaultBatteryPercentage - batteryPercentage;


        return "Your battery is at: " + remainingBatteryPercentage + "%";
    }

}