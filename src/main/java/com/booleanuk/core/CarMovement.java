package com.booleanuk.core;

public class CarMovement {
    Car car;

    public CarMovement(Car car) {
        this.car = car;
    }

    public boolean moveForward(int distance) {
        if(distance < 50) {
            System.out.println("The car has moved forward");
            return true;
        } else {
            System.out.println("The distance is too large, the car cannot move forward");
            return false;
        }
    }

}
