package com.booleanuk.core;

public class RemoteControllerCar {

    private String color;
    private String batteryType;
    private String remoteType;
    private String direction;
    private boolean isMoving;
    private int batteryPercentage;

    public void displayBatteryPercentage() {
        if (batteryPercentage > 0) {
            System.out.println("Battery is at " + batteryPercentage + "%");
        } else {
            System.out.println("Battery is empty. Closing...");
        }
    }

    public void move(String direction) {
        switch (direction) {
            case "forward", "backward", "left", "right": {
                this.direction = direction;
                break;
            }
            default:
                System.out.println("The direction is invalid");
        }
    }

    public boolean replaceBattery(String batteryType) {
        switch (batteryType) {
            case "disposable", "rechargeable": {
                this.batteryType = batteryType;
                return true;
            }
            default: {
                System.out.println("Battery type is invalid");
                return false;
            }
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getRemoteType() {
        return remoteType;
    }

    public void setRemoteType(String remoteType) {
        this.remoteType = remoteType;
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

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
