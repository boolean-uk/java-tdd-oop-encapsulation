package com.booleanuk.core;

public class Battery {

    private BatteryType batteryType;
    private Double batteryLevel;

    public Battery(BatteryType batteryType, Double batteryLevel) {
        this.batteryType = batteryType;
        this.batteryLevel = batteryLevel;
    }

    public BatteryType getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(BatteryType batteryType) {
        this.batteryType = batteryType;
    }

    public Double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
