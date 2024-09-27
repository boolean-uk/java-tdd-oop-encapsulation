package com.booleanuk.core;

public class Battery {

    BatteryType batteryType;
    int percent;



    public Battery(BatteryType batteryType, int percent) {
        this.batteryType = batteryType;
        this.percent = percent;
    }

    public BatteryType getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(BatteryType batteryType) {
        this.batteryType = batteryType;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
