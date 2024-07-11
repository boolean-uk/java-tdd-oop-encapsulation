package com.booleanuk.core;

public class Battery {
    boolean batteryRechargeable = false;
    int batteryRemaining = 100;


    public String getBatteryRemainingAsPercentage(){
        String percentage = batteryRemaining+"%";
        System.out.println(percentage);
        return percentage;
    }

    public void switchBatteryType(){
        if(batteryRechargeable){
            batteryRechargeable = false;
        }else{
            batteryRechargeable = true;
        }
    }
}
