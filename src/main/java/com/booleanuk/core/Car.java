package com.booleanuk.core;

public class Car {

   private String colour;
   private String batteryType;
   private String remoteControlType;
   private int batteryRemaining;
   private boolean isMoving;

   private boolean ableToMove;

    public Car(String colour, String batteryType, String remoteControlType, int batteryRemaining) {
        this.colour = colour;
        this.batteryType = batteryType;
        this.remoteControlType = remoteControlType;
        this.batteryRemaining = batteryRemaining;
        this.isMoving = false;
        this.ableToMove = true;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getRemoteControlType() {
        return remoteControlType;
    }

    public void setRemoteControlType(String remoteControlType) {
        this.remoteControlType = remoteControlType;
    }

    public int getBatteryRemaining() {
        return batteryRemaining;
    }

    public void setBatteryRemaining(int batteryRemaining) {
        this.batteryRemaining = batteryRemaining;
    }

    public boolean getIsMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean getAbleToMove() {
        return ableToMove;
    }

    public void setAbleToMove(boolean ableToMove) {
        this.ableToMove = ableToMove;
    }


    public boolean move(String direction, int distance) {
        if(getAbleToMove()){
            if(getBatteryRemaining()<=0) {
                System.out.println("Low battery can't move!");
                return false;
            }
                if (direction.equals("forward") || direction.equals("backward")) {
                    int batteryCost = distance/1000; //1% per 1000 meters
                    if(batteryCost>getBatteryRemaining()){
                        System.out.println("Not enough battery for this distance");
                        return false;
                    }else{
                        System.out.println("Car is moving " + direction + " for " + distance + " meters.");
                        setBatteryRemaining(getBatteryRemaining()-batteryCost);
                        setIsMoving(true);
                        return true;
                    }
                }
        }
        return false;
    }

    public boolean stop() {
        if(getIsMoving()){
            setIsMoving(false);
            return true;
        }else{
            return false;
        }
    }

    public boolean turn(String direction) {
        if (getIsMoving()){
            System.out.println("Turning: "+direction);
            return true;
        }
        System.out.println("Car is not moving, can not turn");
        return false;
    }

    public void replaceBattery(String batteryType) {
        if(batteryType.equals("rechargeable") || batteryType.equals("disposable")){
            setBatteryType(batteryType);
            setBatteryRemaining(60);
        }
    }

    public void switchRemoteControlType() {
        if(getRemoteControlType().equals("simple")){
            setRemoteControlType("advanced");
        }else{
            setRemoteControlType("simple");
        }
    }
}
