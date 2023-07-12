package com.booleanuk.core;

public class Battery {
    private String type;
    private int percentage;

    public Battery(String type, int percentage) {
        this.type = type;
        this.percentage = percentage;
    }

    public Battery() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
