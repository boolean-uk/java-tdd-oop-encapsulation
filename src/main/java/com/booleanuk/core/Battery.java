package com.booleanuk.core;

public class Battery {

    private String type;
    private int percentageRemaining;

    public Battery(String type) {

        this.type = type;
        this.percentageRemaining = 100;
    }

    public String getType() {
        return type;
    }

    public int getPercentageRemaining() {
        return percentageRemaining;
    }

    public void setPercentageRemaining(int percentage) {
        this.percentageRemaining = percentage;
    }
}
