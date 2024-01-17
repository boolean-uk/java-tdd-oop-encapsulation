package com.booleanuk.core;

public class Car {
    private String color;
    private Battery battery;
    private boolean control;

    public Car(String color, boolean battery, boolean control){
        this.color = color;
        this.battery = new Battery(battery);
        this.control = control;
    }

    public String getColor(){
        return this.color;
    }
    public boolean getControl(){
        return control;
    }
    public void setBattery(Battery battery){
        this.battery = battery;
    }
    public Battery getBattery(){
        return battery;
    }
}
