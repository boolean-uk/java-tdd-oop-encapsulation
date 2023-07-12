package com.booleanuk.core;

public class Car {

    private String color;
    private boolean rechargable = true;

    public Car() {
        this.color = "white";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getRechargable() {
        return rechargable;
    }

    public void setRechargable(boolean rechargable) {
        this.rechargable = rechargable;
    }
}
