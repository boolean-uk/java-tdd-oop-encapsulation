package com.booleanuk.core;

public class RemoteCar {
    private Colour colour;
    private Battery battery;
    private SimpleRemote remote;
    private String lastCommand = "None";

    public Colour getColour() { return colour; }
    public Battery getBattery() { return battery; }
    public SimpleRemote getRemote() { return remote; }
    public String getLastCommand() { return lastCommand; }

    public RemoteCar(Colour colour, Battery battery, SimpleRemote remote) {
        this.colour = colour;
        this.battery = battery;
        this.remote = remote;
    }
    public RemoteCar(SimpleRemote remote) {
        this.remote = remote;
    }
    public RemoteCar() { }

    public void chooseColour(Colour newColour) { }
    public void changeBattery(Battery newBattery) { }
    public void command(String command) { }
}
