package com.booleanuk.core;

public class Battery {

    public String type;
    public int remainingPercentage;

    public Battery() {}
    public Battery(String type, int remainingPercentage) {
        this.type = type;
        this.remainingPercentage = remainingPercentage;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getRemainingPercentage() {
        return remainingPercentage;
    }

    public void setRemainingPercentage(int remainingPercentage) {
        this.remainingPercentage = remainingPercentage;
    }
}
