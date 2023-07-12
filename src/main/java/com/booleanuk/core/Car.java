package com.booleanuk.core;

public class Car {
    String color = "Black";
    Battery battery;

    public Car(){

    }

    public Car(String color, Battery battery) {
        this.color = color;
        this.battery = battery;
    }

    public String pickColor(String color){
        this.color = color;
        return "The color of the car is " + this.color;
    }

    public String chooseBattery(Battery battery){
        this.battery = battery;
        return "The " + this.battery + " is choosen!";
    }
}
