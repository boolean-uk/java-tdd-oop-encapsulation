package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void shouldBeAbleToSelectColourBatteryAndControlType() {

        Car car = new Car(Colour.RED, new Battery(BatteryType.RECHARGABLE, 100d), ControlType.SIMPLE);

        Assertions.assertEquals(Colour.RED, car.getColour());
        Assertions.assertEquals(BatteryType.RECHARGABLE, car.getBattery().getBatteryType());
        Assertions.assertEquals(ControlType.SIMPLE, car.getControlType());
    }

    @Test
    public void shouldChangeBattery() {
        Car car = new Car(Colour.RED, new Battery(BatteryType.RECHARGABLE, 0d), ControlType.SIMPLE);

        car.changeBattery(new Battery(BatteryType.RECHARGABLE, 100d));

        Assertions.assertEquals(100d, car.getBattery().getBatteryLevel());
    }
}
