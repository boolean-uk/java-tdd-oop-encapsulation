package com.booleanuk.core;

public class Battery {

    private String type;
    private int percentageRemaining;

    public Battery(String type, int percentageRemaining) {
        this.type = type;
        this.percentageRemaining = percentageRemaining;
    }

    public String getType() {
        return type;
    }
}
