package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBattery {

    @Test
    public void testBatteryConstructor(){
        Battery testbat = new Battery(true, 15, 2);
    }


    @Test
    public void testUsePower(){
        Battery testbat = new Battery(true, 15, 2);
        testbat.usePower(5);
        Assertions.assertEquals(testbat.getPower(), 95);
    }

}
