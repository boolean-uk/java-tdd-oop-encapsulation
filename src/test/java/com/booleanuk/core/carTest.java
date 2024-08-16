package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class carTest {

    @Test
    public void changeColorTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));
        car.setColor("Red");

        Assertions.assertEquals("Red", car.getColor());
    }

    @Test
    public void setBatteryTypeTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));
        car.getBattery().setBatteryType("Rechargable");

        Assertions.assertEquals("Rechargable", car.getBattery().getBatteryType());
    }

    @Test
    public void setControllTypeTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));
        car.getController().setControllerType("Simple");

        Assertions.assertEquals("Simple", car.getController().getControllerType());
    }

    @Test
    public void checkBatteryTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));


        Assertions.assertEquals(100, car.getBattery().getPercentage());
    }

    @Test
    public void moveForwardTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));


        Assertions.assertEquals("Car moved forward", car.moveForward());
    }

    @Test
    public void moveLeftTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));


        Assertions.assertEquals("Car turned left", car.moveLeft());
    }

    @Test
    public void moveRightTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));


        Assertions.assertEquals("Car turned right", car.moveRight());
    }

    @Test
    public void changeBatteryTest(){
        Car car = new Car("Blue", new Battery("Disposable"), new Controller("Advanced"));
        car.moveForward();
        car.setBattery(new Battery("Disposable"));


        Assertions.assertEquals(100, car.getBattery().getPercentage());
    }




}
