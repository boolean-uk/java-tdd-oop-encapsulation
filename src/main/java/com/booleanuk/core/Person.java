package com.booleanuk.core;

public class Person {
    private Car car;
    private Controller controller;

    public Person(Car car, Controller controller) {
        this.car = car;
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
