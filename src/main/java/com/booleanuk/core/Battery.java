package com.booleanuk.core;

public class Battery {
    boolean isRechargeable;
    int percentage;

    public Battery(boolean isRechargeable) {
        this.isRechargeable = isRechargeable;
        percentage = 100;
    }

    public boolean getType() {
        return this.isRechargeable;
    }

    public int getPercentage() {
        return this.percentage;
    }
}
