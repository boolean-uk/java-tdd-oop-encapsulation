package com.booleanuk.core;

public class Car {
    private String color;
    private Battery battery;
    private boolean hasAdvancedControl;
    private String direction;
    private boolean isMoving;

    public Car(String color, Battery battery, boolean hasAdvancedControl) {
        this.setColor(color);
        this.setBattery(battery);
        this.setHasAdvancedControl(hasAdvancedControl);
        this.direction = "";
        this.isMoving = false;
    }

    public String getColor() {
        return color;
    }
    public boolean setColor(String color) {
        if (color.isBlank()) {
            return false;
        }
        this.color = color;
        return true;
    }
    public Battery getBattery() {
        return battery;
    }
    public void setBattery(Battery battery) {
        this.battery = battery;
    }
    public void replaceBattery(String type) {
        this.battery.setType(type);
    }
    public boolean hasAdvancedControl() {
        return hasAdvancedControl;
    }

    public void setHasAdvancedControl(boolean hasAdvancedControl) {
        this.hasAdvancedControl = hasAdvancedControl;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public String moveCar(String direction, int kilometers) {
        this.setMoving(true);
        return String.format("The car moved %s %d kilometer(s).",direction,kilometers);
    }

    public void stopCar(){
        this.isMoving = false;
    }

    public String turnCar(String direction) {
        this.setDirection(direction);
        return String.format("The car turned %s.",direction);
    }
}
