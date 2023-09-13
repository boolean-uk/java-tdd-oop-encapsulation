package com.booleanuk.core;

public class Battery {

    private String type;
    private int remainingPercentage;

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
