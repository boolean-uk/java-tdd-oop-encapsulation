package com.booleanuk.core;

public class Car {

    final String color;
    String battery;

    public Car(String color, String battery) {
        if (color == null || battery == null) {
            throw new NullPointerException();
        }
        this.color = color;
        this.battery = battery;
    }

}
