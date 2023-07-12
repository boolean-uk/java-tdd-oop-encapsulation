package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RcCarTest {
    @Test
    void move_shouldUpdateDistance() {
        var rcCar = RcCar.builder()
                .distanceTravelled(0)
                .build();

        rcCar.move(10);

        assertEquals(10, rcCar.getDistanceTravelled());
    }

    @Test
    void move_shouldDrainBattery() {
        var rcCar = RcCar.builder()
                .batteryPercentage(100)
                .build();

        rcCar.move(20);

        assertEquals(80, rcCar.getBatteryPercentage());
    }

    @Test
    void replaceBattery_shouldResetBatteryPercentageTo100() {
        var rcCar = RcCar.builder()
                .batteryPercentage(10)
                .build();

        rcCar.replaceBatteries(BatteryType.Disposable);

        assertEquals(100, rcCar.getBatteryPercentage());
    }
}