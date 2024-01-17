package com.booleanuk.core;

public class RCCar {
    String color = "Red";
    String batteryType = "disposable";
    String controlLevel = "simple";
    int batteryLevel = 100;

    String wheelDirection = "Straight";




    public void setColor(String color) {
        this.color = color;
    }

    public void setBatteryType(String batteryType) {
        if (batteryType.equals("disposable") || batteryType.equals("rechargable"))
            this.batteryType = batteryType;
    }
    public void setControlLevel(String controlLevel) {
        if (controlLevel.equals("simple") || controlLevel.equals("advanced"))
            this.controlLevel = controlLevel;
    }
    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel > 100)
            this.batteryLevel= 100;
        else if ( batteryLevel < 0)
            this.batteryLevel = 0;
        else
            this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public boolean move(String direction, int distance) {
        if (direction.equals("foreward") || direction.equals("backward")) {

            // Move foreward by distance

            //battery gets used (1% batter per 5 units travelld)
            this.batteryLevel -= (distance/5);

            return true;
        }
        return false;
    }


    public boolean stop() {

        // stop car if moving

        // if still car is at a stop

        return true;
    }

    public boolean turn(String direction) {
        if (direction.equals("left") || direction.equals("right") || direction.equals("straight")) {
            this.wheelDirection = direction;
            return true;
        }
        return false;
    }

    public String changeBattery(String newBattery) {
        if (newBattery.equals("disposable") || newBattery.equals("rechargable"))
            this.batteryType = newBattery;
        return this.batteryType;
    }




}
