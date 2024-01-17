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
        Car car = new Car("Blue", "Rechargable", "Simple");

        Assertions.assertEquals(100.00, car.getBatteryPercentage());


    }
    @Test
    public void testMoveCarForward() {
        Car car = new Car("Blue", "Rechargable", "Simple");

        Assertions.assertTrue(car.moveCarForward());
        Assertions.assertEquals(51.00, car.getPositionY());

    }
    @Test
    public void testMoveCarBackwards() {
        Car car = new Car("Blue", "Rechargable", "Simple");
        Assertions.assertTrue(car.moveCarBackwards());

        Assertions.assertEquals(49.00, car.getPositionY());
    }
    @Test
    public void testMoveCarRight() {
        Car car = new Car("Blue", "Rechargable", "Simple");
        Assertions.assertTrue(car.moveCarRight());
        Assertions.assertEquals(51.00, car.getPositionX());

    }
    @Test
    public void testMoveCarLeft() {
        Car car = new Car("Blue", "Rechargable", "Simple");

        Assertions.assertTrue(car.moveCarLeft());
        Assertions.assertEquals(49.00, car.getPositionX());
    }
    @Test
    public void testStopCar() {
        Car car = new Car("Blue", "Rechargable", "Simple");

        Assertions.assertTrue(car.stopCar());
    }





}
