package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testMove(){
        Car car = new Car("blue","disposable","simple", 100);
        car.setAbleToMove(true);
        Assertions.assertTrue(car.move("forward", 10));
        car.setAbleToMove(false);
        Assertions.assertFalse(car.move("forward", 10));
        car.setAbleToMove(true);

        car.setBatteryRemaining(0);
        Assertions.assertFalse(car.move("forward", 10));

        car.setBatteryRemaining(5);
        Assertions.assertFalse(car.move("backward", 6000));//battery not enough for this move

    }
    @Test
    public void testStop(){
        Car car = new Car("blue","disposable","simple", 100);
        car.setIsMoving(true);
        Assertions.assertTrue(car.stop());
        car.setIsMoving(false);
        Assertions.assertFalse(car.stop());


    }
    @Test
    public void testTurn(){
        Car car = new Car("blue","disposable","simple", 100);
        car.setIsMoving(true);
        Assertions.assertTrue(car.turn("left"));
        Assertions.assertTrue(car.turn("right"));
        car.setIsMoving(false);
        Assertions.assertFalse(car.turn("left"));

    }
    @Test
    public void testReplaceBattery() {
        Car car = new Car("blue","disposable","simple", 100);
        car.setBatteryType("rechargeable");
        car.replaceBattery("disposable");
        Assertions.assertEquals("disposable",car.getBatteryType());
        car.replaceBattery("wrongBatteryType");
        Assertions.assertEquals("disposable",car.getBatteryType());


    }
    @Test
    public void testSwitchRemoteControlType() {
        Car car = new Car("blue","disposable","simple", 100);
        car.setRemoteControlType("simple");
        car.switchRemoteControlType("advanced");
        Assertions.assertEquals("advanced",car.getRemoteControlType());
        car.switchRemoteControlType("wrongControlType");
        Assertions.assertEquals("advanced",car.getRemoteControlType());
    }


}
