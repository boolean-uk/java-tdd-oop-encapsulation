package com.booleanuk.core;

public class Battery {

    String type;
    int chargeStatus;

    public Battery(String type, int chargeStatus) {
        this.type = type;
        this.chargeStatus = chargeStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(int chargeStatus) {
        this.chargeStatus = chargeStatus;
    }
}
