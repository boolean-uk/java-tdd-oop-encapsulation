package com.booleanuk.core;

public class Battery {
    private boolean isRechargable;
    private int percentPowerLeft;

    public Battery(boolean isRechargable){
        this.isRechargable = isRechargable;
        this.percentPowerLeft = 100;
    }

    public int usePower(int usage){
        percentPowerLeft -= usage;
        if (percentPowerLeft < 0) {
            percentPowerLeft = 0;
        }
        return 0;
    }

    public int getPower(){
        return percentPowerLeft;
    }

    public int rechargeBattery(int power){
        if(!isRechargable) {
            return percentPowerLeft;
        }

        percentPowerLeft += power;
        if (percentPowerLeft > 100){
            percentPowerLeft = 100;
        }

        return percentPowerLeft;
    }


}
