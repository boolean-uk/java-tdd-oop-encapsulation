package com.booleanuk.core;

public class Battery {
    private String type;
    private Integer remainingBatteryPercentage;

    public Battery(String type){
        this.type = type;
        this.remainingBatteryPercentage = 100;
    }

    public Integer getRemainingBatteryPercentage(){
        return this.remainingBatteryPercentage;
    }

    public void setRemainingBatteryPercentage(int newRemainingBatteryPercentage){
        this.remainingBatteryPercentage = newRemainingBatteryPercentage;
    }

    public String getBatteryType(){
        return this.type;
    }
}
