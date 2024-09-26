package com.booleanuk.core;

public class Battery {
    private boolean rechargeableBattery;

    public Battery(Boolean rechargeableBattery){
        this.rechargeableBattery = rechargeableBattery;
    }
    public boolean getBattery(){
        return this.rechargeableBattery;
    }
}
