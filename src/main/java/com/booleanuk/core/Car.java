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

    public boolean moveCarBackwards(int distance) {
        if (distance < 1) {
            return false;
        }
        batteryPercentage -= distance == 1 ? 1 : (distance / 2);
        return true;
    }

    public boolean stopCar() {
        return true;
    }

    public boolean turnCar(String direction) {
       if (direction == null) {
           throw new NullPointerException();
       }
       if (direction.equals("left")) {
           return true;
       } else if (direction.equals("right")) {
           return true;
       }
        System.out.println("Invalid direction");
         return false;
    }

    public boolean setBatteryType(String batteryType) {
        if (batteryType == null) {
            throw new NullPointerException();
        }
        if (batteryType.equalsIgnoreCase("rechargeable") || batteryType.equalsIgnoreCase("non-rechargeable")) {
            this.batteryType = batteryType;
            return true;
        }
        return false;
    }

}
