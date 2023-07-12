package com.booleanuk.core;

public class Battery {
    String type;
    int percentageRemaining;

    public Battery(String type) {
        this.type = type;
        this.percentageRemaining = 100;
    }

    public Battery(String type, int percentageRemaining) {
        this.type = type;
        this.percentageRemaining = percentageRemaining;
    }

    public int checkPercentageRemaining(){
        return percentageRemaining;
    }

    @Override
    public String toString() {
        return type + " battery with " + percentageRemaining + "% remaining";
    }
}
