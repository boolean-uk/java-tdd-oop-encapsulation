package com.booleanuk.core;

public class Car {

    private String colour;
    private boolean rechargableBattery;
    private boolean simpleControl;
    private int batteryLevel;
    private int positionY;
    private boolean moving;
    private String direction;

    Car(String colour, boolean rechargableBattery, boolean simpleControl){
        this.colour = colour;
        this.rechargableBattery = rechargableBattery;
        this.simpleControl = simpleControl;
        this.batteryLevel = 100;
        this.positionY = 0;
        this.moving = false;
        this.direction = "vertical";
    }

    public boolean move(){
        this.moving = true;
        return this.moving;
    }

    public int move(int i){
        this.positionY += i;
        return this.positionY;
    }

    public boolean stop(){
        this.moving = false;
        return this.moving;
    }

    public String turn(String s){
        s.toLowerCase();
        if(s.equals("vertical")){
            this.direction = "vertical";
        }
        else if(s.equals("right")){
            this.direction = "right";
        }
        else if(s.equals("left")){
            this.direction = "left";
        }
        return direction;
    }

}
