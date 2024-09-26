package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    public static Car car;
    public static Battery battery;
    public static RemoteController controller;
    @BeforeEach
    public void setUp(){
         battery = new Battery("rechargable",100);
         controller = new RemoteController("simple");
         car = new Car(battery, controller, "black");
    }
    @Test
    public void testColourChange(){
        car.changeColour("white");
        Assertions.assertEquals("white",car.getColour());
    }

    @Test
    public void testBatteryChargeStatus(){
        car.batteryChargeStatus();
        Assertions.assertEquals(100,car.batteryChargeStatus());
    }

    @Test
    public void turnLeftTest(){

        Assertions.assertEquals("Car has turned left", car.turnLeft());
    }

    @Test
    public void turnRightTest(){

        Assertions.assertEquals("Car has turned right", car.turnRight());
    }

}
