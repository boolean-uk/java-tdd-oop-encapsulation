package com.booleanuk.core;

class RemoteCar {
    private String color;
    private Battery battery;
    private RemoteControl remoteControl;

    public RemoteCar() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public int getBatteryPercentage() {
        return battery.getPercentageRemaining();
    }

    public void moveForward(int distance) {
        System.out.println("Moving forward " + distance + " units.");
    }

    public void moveBackward(int distance) {
        System.out.println("Moving backward " + distance + " units.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void turnLeft() {
        System.out.println("Turning left.");
    }

    public void turnRight() {
        System.out.println("Turning right.");
    }

    public void replaceBattery(Battery newBattery) {
        System.out.println("Replacing battery with a " + newBattery.getType() + " battery.");
        this.battery = newBattery;
    }
}
