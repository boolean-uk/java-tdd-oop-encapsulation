package com.booleanuk.core;

public class Battery {
    int percentage;
    String batteryType;

    public Battery(String batteryType) {
        this.percentage = 100;
        this.batteryType = batteryType;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage){
        this.percentage = percentage;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "percentage=" + percentage +
                ", batteryType='" + batteryType + '\'' +
                '}';
    }
}
