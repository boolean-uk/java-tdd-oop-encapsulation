package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testSetBatteries() {
        Car car = new Car("Blue", "Rechargable", "Simple");

        Assertions.assertTrue(car.setBatteries("Disposable"));
        Assertions.assertEquals("Disposable", car.getBatteries());
        Assertions.assertFalse(car.setBatteries("Wrong Input"));

    }

    @Test
    public void testSetRemoteControll() {
        Car car = new Car("Blue", "Rechargable", "Simple");

        Assertions.assertEquals("Simple", car.getRemoteControll());
        Assertions.assertTrue(car.setRemoteControll("Advanced"));
        Assertions.assertEquals("Advanced", car.getRemoteControll());
        Assertions.assertFalse(car.setRemoteControll("Wrong input"));


    }
    @Test
    public void testGetBatteryPercentage() {

    }
    @Test
    public void testMoveCarForward() {

    }
    @Test
    public void testMoveCarBackwards() {

    }
    @Test
    public void testMoveCarRight() {

    }
    @Test
    public void testMoveCarLeft() {

    }
    @Test
    public void testStopCar() {

    }





}
