package com.booleanuk.core;

/*
* I assume this doesn't need some kind of terminal based ui. This program has all
* the functionalities that the user stories asked for, but doesn't have a way to
* access them outside the tests. I'm making the assumption that there's no need
* for me to make a ui because the assignment didn't ask for it. I also don't have
* time right now. If that's something I should add in a main somewhere for manual
* testing, I'll do that next week
* */
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
