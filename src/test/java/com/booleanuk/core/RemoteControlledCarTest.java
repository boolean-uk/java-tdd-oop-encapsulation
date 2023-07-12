package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {

    @Test
    public void stopTest(){
        RemoteControlledCar car = new RemoteControlledCar();
        Assertions.assertEquals("Car stopped", car.stop());
    }

    @Test
    public void turnTest(){
        RemoteControlledCar car = new RemoteControlledCar();
        Assertions.assertEquals("Turned left", car.turn("left"));
        Assertions.assertEquals("Turned right", car.turn("right"));
    }

    @Test
    public void replaceBatteryTest(){
        RemoteControlledCar car = new RemoteControlledCar();
        Battery battery = new Battery("disposable");
        Assertions.assertEquals("Battery replaced to: disposable battery with 100% remaining", car.replaceBattery(battery));
    }

    @Test
    public void checkPercentage(){
        Battery battery = new Battery("disposable",85);
        Assertions.assertEquals(85, battery.checkPercentageRemaining());
    }
}
