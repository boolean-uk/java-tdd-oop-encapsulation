package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoteControllerCarTest {

    private RemoteControllerCar car;

    @BeforeEach
    public void setup() {
        car = new RemoteControllerCar();
    }

    @Test
    public void testSetCarColour() {
        car.setColor("Black");
        Assertions.assertEquals("Black", car.getColor());
    }

    @Test
    public void testBatteryType() {
        car.setBatteryType("Rechargeable");
        Assertions.assertEquals("rechargeable", car.getBatteryType());

        car.setBatteryType("invalid");
        Assertions.assertEquals("rechargeable", car.getBatteryType());
    }

    @Test
    public void testRemoteType() {
        car.setRemoteType("advanced");
        Assertions.assertEquals("advanced", car.getRemoteType());

        car.setRemoteType("invalid");
        Assertions.assertEquals("advanced", car.getRemoteType());
    }

    @Test
    public void testBatteryPercentage() {
        car.setBatteryPercentage(75);
        Assertions.assertEquals(75, car.getBatteryPercentage());
        car.displayBatteryPercentage();

        car.setBatteryPercentage(107);
        Assertions.assertEquals(75, car.getBatteryPercentage());
        car.displayBatteryPercentage();
    }

    @Test
    public void testMove() {
        car.move("forward");
        Assertions.assertEquals("forward", car.getDirection());

        car.move("upwards");
        Assertions.assertEquals("forward", car.getDirection());
    }

    @Test
    public void testIsMoving() {
        car.setMoving(true);
        Assertions.assertTrue(car.isMoving());

        car.setMoving(false);
        Assertions.assertFalse(car.isMoving());
    }

    @Test
    public void testReplaceBattery() {
        Assertions.assertTrue(car.replaceBattery("disposable"));
        Assertions.assertFalse(car.replaceBattery("something"));
    }
}
