package com.booleanuk.core;

public class RcCar {
    private String colour;
    private Battery battery;
    private boolean advancedControl;

    public RcCar(String colour, boolean advancedControl, boolean batteryIsRechargeable) {
        this.colour = colour;
        this.advancedControl = advancedControl;
        this.battery = new Battery(batteryIsRechargeable,100);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public boolean getAdvancedControl() {
        return advancedControl;
    }

    public void setAdvancedControl(boolean advancedControl) {
        this.advancedControl = advancedControl;
    }

    public String move(String direction, double distance) {
        return "Car moved " + direction + " " + distance + " meters.";
    }

    public boolean stop() {
        return true;
    }

    public String turn(String direction){
        return "car turned " + direction + ".";
    }

    public void replaceBattery(Battery newBattery) {
        this.battery = newBattery;
    }

    @Override
    public String toString(){
        return "colour: " + this.colour +
                "\nadvanced control: " + this.advancedControl +
                "\nbattery\n rechargeable: " + this.battery.getIsRechargeable() +
                "\n percentage: " + this.battery.getPercentage();
    }
}
