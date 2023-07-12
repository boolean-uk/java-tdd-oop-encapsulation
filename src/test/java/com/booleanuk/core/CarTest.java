package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testMoveForward() {
        remote.setType("Advanced");
        car.setRemote(remote);
        battery.setType("Rechargeable");
        battery.setLevel(100);
        car.setBattery(battery);
        car.turn("Forward");
        car.move(10);
        Assertions.assertEquals(10, car.getPosition());
        Assertions.assertEquals("Forward", car.getDirection());
        Assertions.assertEquals(99, car.getBattery().getLevel());
    }

    @Test
    public void testMoveBackward() {
        remote.setType("Advanced");
        car.setRemote(remote);
        battery.setType("Rechargeable");
        battery.setLevel(100);
        car.setBattery(battery);
        car.turn("Backward");
        car.move(10);
        Assertions.assertEquals(-10, car.getPosition());
        Assertions.assertEquals("Backward", car.getDirection());
        Assertions.assertEquals(99, car.getBattery().getLevel());
    }

    @Test
    public void testStopMoving() {
        remote.setType("Advanced");
        car.setRemote(remote);
        battery.setType("Rechargeable");
        battery.setLevel(100);
        car.setBattery(battery);
        car.turn("Forward");
        car.move(10);
        car.stop();
        Assertions.assertEquals(10, car.getPosition());
        Assertions.assertEquals("Forward", car.getDirection());
        Assertions.assertEquals(99, car.getBattery().getLevel());
    }
}
