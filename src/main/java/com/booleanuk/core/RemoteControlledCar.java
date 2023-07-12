package com.booleanuk.core;

import java.sql.SQLOutput;

public class RemoteControlledCar {
    private static final int DEFAULT_DISTANCE_TRAVELED = 0;
    private static final double DEFAULT_BATTERY_PERCENTAGE = 100;
    private static final int DEFAULT_WHEELS_POSITION = 0;
    private String colour;
    private BatteryType batteryType;
    private boolean remoteControllerAdvanced;
    private double batteryPercentage;
    private double distanceTraveled;
    private int wheelsPosition;

    public RemoteControlledCar(String colour, BatteryType batteryType, boolean remoteControllerAdvanced) {
        this.colour = colour;
        this.batteryType = batteryType;
        this.remoteControllerAdvanced = remoteControllerAdvanced;
        this.batteryPercentage = DEFAULT_BATTERY_PERCENTAGE;
        this.distanceTraveled = DEFAULT_DISTANCE_TRAVELED;
        this.wheelsPosition = DEFAULT_WHEELS_POSITION;
    }

    public void move(double distance, Direction direction){
        if (direction.equals(Direction.FORWARD) || direction.equals(Direction.BACKWARD)){
            this.distanceTraveled += distance;
        }
        else
            throw new IllegalStateException("You can move only given distance forward or backward");
    }

    public void move(Direction direction){
        if (direction.equals(Direction.LEFT) || direction.equals(Direction.RIGHT)){
            wheelsPosition = direction.equals(Direction.LEFT) ? -1 : 1;
            System.out.println("Car is moving " + direction);
        }
        else {
            wheelsPosition = DEFAULT_WHEELS_POSITION;
            throw new IllegalStateException("Wrong direction. Please enter LEFT or RIGHT to turn.");
        }

        System.out.println(wheelsPosition);
    }
    public double getBatteryPercentage() {
        return batteryPercentage;
    }
    public int getWheelsPosition() {
        return wheelsPosition;
    }

    public void setWheelsPosition(int wheelsPosition) {
        this.wheelsPosition = wheelsPosition;
    }

    public void stopMoving(){
        System.out.println("Car stopped moving");
    }

    public BatteryType getBatteryType() {
        return batteryType;
    }

    public void replaceBattery(BatteryType batteryType){
        this.batteryType = batteryType;
        this.batteryPercentage = DEFAULT_BATTERY_PERCENTAGE;
    }


}

enum Direction {
    FORWARD,
    BACKWARD,
    LEFT,
    RIGHT
}

enum BatteryType {
    RECHARGEABLE,
    DISPOSABLE
}
