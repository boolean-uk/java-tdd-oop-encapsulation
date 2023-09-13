package com.booleanuk.core;

public class RemoteControlledCar {
    String colour;
    Battery battery;
    boolean controllerIsAdvanced;

    public RemoteControlledCar(String colour, boolean batteryType, boolean controllerType) {
        setColour(colour);
        Battery battery = new Battery(batteryType);
        setBattery(battery);
        setController(controllerType);
    }

    public void setColour(String colour) {
        this.colour = colour;
        System.out.println("Car's colour set to " + colour);
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
        System.out.println("Car now contains " + (battery.getType()?"rechargeable batteries":"disposable batteries"));
    }

    public void setController(boolean isAdvanced) {
        this.controllerIsAdvanced = isAdvanced;
        System.out.println("Car's controller is " + (isAdvanced?"advanced":"simple"));
    }

    public int viewBatteryPercentage() {
        return this.battery.getPercentage();
    }

    public void moveForward(int distance) {
        System.out.println("Car moved " + distance + "m forward.");
    }

    public void moveBackwards(int distance) {
        System.out.println("Car moved " + distance + "m backwards.");
    }

    public void stopMoving() {
        System.out.println("Car stopped moving.");
    }

    public void turnLeft() {
        System.out.println("Car turned left.");
    }

    public void turnRight() {
        System.out.println("Car turned right.");
    }
}
