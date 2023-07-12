package com.booleanuk.core;

public class Battery {
    String type;
    int remainingPercentage;

    public Battery(String type) {
        this.type = type;
        this.remainingPercentage = 100;
    }

    public int getRemainingPercentage() {
        return remainingPercentage;
    }


}
