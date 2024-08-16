package com.booleanuk.core;

import javax.naming.ldap.Control;

public class Car {
    String color;
    Battery battery;
    Controller controller;

    public Car(String color, Battery battery, Controller controller){
        this.color=color;
        this.battery=battery;
        this.controller = controller;
    }

    public String moveForward(){
        this.battery.setPercentage(this.battery.getPercentage()-1);
        return "Car moved forward";
    }

    public String moveLeft(){
        this.battery.setPercentage(this.battery.getPercentage()-1);
        return "Car turned left";
    }

    public String moveRight(){
        this.battery.setPercentage(this.battery.getPercentage()-1);
        return "Car turned right";
    }

    public String stopCar(){
        return "Car stopped";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", battery=" + battery +
                ", controller=" + controller +
                '}';
    }

    //sanity check
    public static void main(String[] args) {
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));

        System.out.println(car);

        System.out.println(car.moveRight());


    }
}
