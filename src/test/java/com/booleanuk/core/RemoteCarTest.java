package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.Point;

public class RemoteCarTest {

    @Test
    public void moveFrontBackByOneTest() {
        RemoteCar car = new RemoteCar("Blue", new Battery("Rechargeable"), new Controller("Advanced"));
        Point position = car.getPosition();
        Assertions.assertEquals(new Point(1,0),car.moveFrontBack(1));;
    }

    @Test
    public void turningCarByOneTest() {
        RemoteCar car = new RemoteCar("Blue", new Battery("Rechargeable"), new Controller("Advanced"));
        Assertions.assertEquals(new int[]{0,0}, car.getDirection());
    }

    @Test
    public void setBatteryToDisposableTest() {
        RemoteCar car = new RemoteCar("Blue", new Battery("Rechargeable"), new Controller("Advanced"));
        car.getBattery().setBatteryType("Disposable");
        Assertions.assertEquals("Disposable", car.getBattery().getBatteryType());
    }

    @Test
    public void getBatteryPercentageTest() {
        RemoteCar car = new RemoteCar("Blue", new Battery("Rechargeable"), new Controller("Advanced"));
        Assertions.assertEquals(100, car.getBattery().getBatteryPercentage());
    }

    @Test
    public void setControllerTypeToSimpleTest() {
        RemoteCar car = new RemoteCar("Blue", new Battery("Rechargeable"), new Controller("Advanced"));
        car.getController().setControllerType("Simple");
        Assertions.assertEquals("Simple", car.getController().getControllerType());
    }
}
