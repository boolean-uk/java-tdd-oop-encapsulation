package com.booleanuk.core;

public class Battery {
    private boolean isRechargeable;
    private int percentage;

    public Battery(boolean rechargeable, int percentage) {
        this.isRechargeable = rechargeable;
        this.percentage = percentage;
    }

    public boolean getIsRechargeable() {
        return this.isRechargeable;
    }

    public void setRechargeable(boolean isRechargeable) {
        this.isRechargeable = isRechargeable;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
