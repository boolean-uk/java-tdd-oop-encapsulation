package com.booleanuk.core;

public class Controller {
    private boolean advanced;

    public Controller(boolean advanced) {
        this.advanced = advanced;
    }

    public int seeBatteryPercentage(Car car) {
        return car.getBatteryPercentage();
    }

    public void moveCar(Car car, int time) {
        car.runCar(10);
    }
}
