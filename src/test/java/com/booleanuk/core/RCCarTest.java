package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RCCarTest {

    @Test
    public void testMembers(){
        RCCar rcCar = new RCCar();
        rcCar.setColor("Blue");
        rcCar.setBatteryType("rechargable");
        rcCar.setControlLevel("advanced");
        rcCar.setBatteryLevel(90);
        int batteryLevel = rcCar.getBatteryLevel();

        Assertions.assertEquals("Blue", rcCar.color);
        Assertions.assertEquals("rechargable", rcCar.batteryType);
        Assertions.assertEquals("advanced", rcCar.controlLevel);
        Assertions.assertEquals(90, rcCar.batteryLevel);
        Assertions.assertEquals(90, batteryLevel);

        rcCar.setColor("Green");
        rcCar.setBatteryType("disposable");
        rcCar.setControlLevel("simple");
        rcCar.setBatteryLevel(100);
        Assertions.assertEquals("Green", rcCar.color);
        Assertions.assertEquals("disposable", rcCar.batteryType);
        Assertions.assertEquals("simple", rcCar.controlLevel);
        Assertions.assertEquals(100, rcCar.batteryLevel);
    }

    @Test
    public void testMembersInvalidInputs(){
        RCCar rcCar = new RCCar();
        rcCar.setBatteryType("lithium");
        rcCar.setControlLevel("complex");
        rcCar.setBatteryLevel(200);

        Assertions.assertEquals("disposable", rcCar.batteryType);
        Assertions.assertEquals("simple", rcCar.controlLevel);
        Assertions.assertEquals(100, rcCar.batteryLevel);

        rcCar.setBatteryLevel(-1);
        Assertions.assertEquals(0, rcCar.batteryLevel);
    }

    // move foreward
    @Test
    public void testMoveForeward10() {
        RCCar rcCar = new RCCar();
        Assertions.assertEquals(100, rcCar.getBatteryLevel());
        boolean result = rcCar.move("foreward", 10);
        Assertions.assertTrue(result);
        Assertions.assertEquals(98, rcCar.getBatteryLevel());
    }

    @Test
    public void testMoveBackward20() {
        RCCar rcCar = new RCCar();
        Assertions.assertEquals(100, rcCar.getBatteryLevel());
        boolean result = rcCar.move("backward", 20);
        Assertions.assertTrue(result);
        Assertions.assertEquals(96, rcCar.getBatteryLevel());
    }

    @Test
    public void testMoveIllegalInput() {
        RCCar rcCar = new RCCar();
        Assertions.assertEquals(100, rcCar.getBatteryLevel());
        boolean result = rcCar.move("upward", 20);
        Assertions.assertFalse(result);
        Assertions.assertEquals(100, rcCar.getBatteryLevel());
    }

    // Stop
    @Test
    public void testStop() {
        RCCar rcCar = new RCCar();
        boolean result = rcCar.stop();
        Assertions.assertTrue(result);
    }

    // Turn
    @Test
    public void testTrunValid() {
        RCCar rcCar = new RCCar();
        boolean result = rcCar.turn("left");
        Assertions.assertTrue(result);
        result = rcCar.turn("right");
        Assertions.assertTrue(result);
        result = rcCar.turn("straight");
        Assertions.assertTrue(result);
    }

    @Test
    public void testTrunInValid() {
        RCCar rcCar = new RCCar();
        boolean result = rcCar.turn("foreward");
        Assertions.assertFalse(result);
    }

    // Change Battery
    @Test
    public void testChangeBatterValid() {
        RCCar rcCar = new RCCar();
        String result = rcCar.changeBattery("rechargable");
        Assertions.assertEquals("rechargable", result);
        result = rcCar.changeBattery("disposable");
        Assertions.assertEquals("disposable", result);
    }

    @Test
    public void testChangeBatterInValid() {
        RCCar rcCar = new RCCar();
        String result = rcCar.changeBattery("lithium");
        Assertions.assertEquals("disposable", result);
    }
}
