package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCar {
    @BeforeEach
    public void setUp() {
        String color ="red";
        boolean isAdvancedRemoteControl=true;
        boolean isBatteryRechargable=true;
        Car car = new Car(color,isAdvancedRemoteControl,isBatteryRechargable);
    }
    @Test
    public void carChangeControlsChangeToSimple()  {


        // Execute
        boolean result=car.changeControls();

        // Verify
        Assertions.assertFalse(result);
    }

}
