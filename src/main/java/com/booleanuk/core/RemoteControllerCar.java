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
        direction = direction.toLowerCase();
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
        batteryType = batteryType.toLowerCase();
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
        replaceBattery(batteryType);
    }

    public String getRemoteType() {
        return remoteType;
    }

    public void setRemoteType(String remoteType) {
        remoteType = remoteType.toLowerCase();
        switch (remoteType) {
            case "simple", "advanced":  {
                this.remoteType = remoteType;
                break;
            }
            default: {
                System.out.println("Remote type is invalid");
                break;
            }
        }
    }

    public String getDirection() {
        return direction;
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
        if (batteryPercentage < 0 || batteryPercentage > 100) {
            System.out.println("Battery Percentage not valid");
        } else {
            this.batteryPercentage = batteryPercentage;
        }
    }
}
