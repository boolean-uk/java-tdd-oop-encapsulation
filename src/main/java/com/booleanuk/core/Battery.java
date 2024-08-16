package com.booleanuk.core;

public class Battery {
    private String type;
    private Integer remainingBatteryPercentage;

    public Battery(String type){
        this.type = type;
    }

    public Integer getRemainingBatteryPercentage(){
        return this.remainingBatteryPercentage;
    }

    public String getBatteryType(){
        return this.type;
    }

}
