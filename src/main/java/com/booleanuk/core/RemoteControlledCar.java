package com.booleanuk.core;

public class RemoteControlledCar {
    private String color;
    private boolean isBatteryRechargeable;
    private boolean isRemoteControllerAdvanced;
    int batteryStatus;

    public static final String VEHICLE_FORWARD = "Vehicle moved forward";
    public static final String VEHICLE_BACKWARD = "Vehicle moved backwards";
    public static final String VEHICLE_STOPPED = "Vehicle stopped";
    public static final String VEHICLE_LEFT = "Vehicle turned left";
    public static final String VEHICLE_RIGHT = "Vehicle turned right";
    public static final String ADVANCED_OPTION = "Option for advanced controller only";
    public static final String BATTERY_TYPE_CHANGED = "Battery type changed to";
    public static final String REMOTE_CONTROLLER_CHANGED = "Remote controller changed to";
    public static final String INCORRECT_BATTERY_STATUS = "Incorrect batteryStatus. It must be in range [0, 100]";

    public RemoteControlledCar(String color, boolean isBatteryRechargeable, boolean isRemoteControllerAdvanced, int batteryStatus) {
        this.color = color;
        this.isBatteryRechargeable = isBatteryRechargeable;
        this.isRemoteControllerAdvanced = isRemoteControllerAdvanced;
        this.batteryStatus = batteryStatus;
    }

    public String moveForward(int distance) {
        return VEHICLE_FORWARD + " " + distance;
    }

    public String moveBackwards(int distance) {
        return VEHICLE_BACKWARD + " " + distance;
    }

    public String stop() {
        return VEHICLE_STOPPED;
    }

    public String turnLeft() {
        if (isRemoteControllerAdvanced) {
            return VEHICLE_LEFT;
        }
        return ADVANCED_OPTION;
    }

    public String turnRight() {
        if (isRemoteControllerAdvanced) {
            return VEHICLE_RIGHT;
        }
        return ADVANCED_OPTION;
    }

    public String changeBatteryType() {
        isBatteryRechargeable = !isBatteryRechargeable;
        return BATTERY_TYPE_CHANGED + " " + isBatteryRechargeable;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String changeRemoteControllerAdvanced() {
        isRemoteControllerAdvanced = !isRemoteControllerAdvanced;
        String controllerType = isRemoteControllerAdvanced ? "advanced" : "basic";
        return REMOTE_CONTROLLER_CHANGED + " " + controllerType;

    }

    public void setBatteryStatus(int batteryStatus) {
        if (batteryStatus >= 0 && batteryStatus <= 100) {
            this.batteryStatus = batteryStatus;
        } else {
            throw new IllegalArgumentException(INCORRECT_BATTERY_STATUS);
        }
    }

    public String getColor() {
        return color;
    }

    public boolean isBatteryRechargeable() {
        return isBatteryRechargeable;
    }

    public boolean isRemoteControllerAdvanced() {
        return isRemoteControllerAdvanced;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }
}
