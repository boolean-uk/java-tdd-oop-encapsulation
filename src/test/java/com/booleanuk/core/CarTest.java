package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void shouldBeAbleToSelectColourBatteryAndControlType() {

        Car car = new Car(Colour.RED, new Battery(BatteryType.RECHARGABLE, 100), ControlType.Remote);

        Assertions.assertEquals("RED", car.getColour());
        Assertions.assertEquals("Rechargable", car.getBattery().getBatteryTpe());
        Assertions.assertEquals("Remote", car.getControlType());
    }
}
