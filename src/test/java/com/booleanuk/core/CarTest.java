package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car("blue", BatteryType.RECHARGABLE, RemoteType.SIMPLE);

    }

    @Test
    public void setColourTest(){
        car.setColour("red");
        Assertions.assertEquals("red", car.getColour());
    }

    @Test
    public void setBatteryTest(){
        car.setBattery(BatteryType.DISPOSABLE);
        Assertions.assertEquals(BatteryType.DISPOSABLE, car.getBattery());
    }

    @Test
    public void setRemoteTest(){
        car.setRemote(RemoteType.ADVANCED);
        Assertions.assertEquals(RemoteType.ADVANCED, car.getRemote());
    }

    @Test
    public void getBatteryPercentageTest(){
        Assertions.assertEquals(100, car.getBatteryPercentage());
    }

    @Test
    public void moveForwardTest(){
        car.moveForward(5);
        Assertions.assertEquals(5, car.getDistance());
    }

    @Test
    public void moveBackwardTest(){
        car.moveBackward(5);
        Assertions.assertEquals(5, car.getDistance());
    }

    @Test
    public void moveRandomlyTest(){
        car.moveBackward(5);
        car.moveForward(3);
        car.moveBackward(10);
        Assertions.assertEquals(18, car.getDistance());
    }

    @Test
    public void stopTest(){
        Assertions.assertTrue(car.stop());
    }

    @Test
    public void turnLeftTest(){
        car.turnLeft();
        Assertions.assertEquals("Left", car.getDirection());
    }

    @Test
    public void turnRightTest(){
        car.turnRight();
        Assertions.assertEquals("Right", car.getDirection());
    }
}
