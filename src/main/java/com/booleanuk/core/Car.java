package com.booleanuk.core;

public class Car {

    final String color;
    String batteryType;
    int batteryPercentage = 100;

    public Car(String color, String battery) {
        if (color == null || battery == null) {
            throw new NullPointerException();
        }
        this.color = color;
        this.batteryType = battery;
    }

    public boolean moveCarForward(int distance) {
        if (distance < 1) {
            return false;
        }
        batteryPercentage -= distance == 1 ? 1 : (distance / 2);
        return true;
    }

}
