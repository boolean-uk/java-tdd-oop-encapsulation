package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBattery {

    @Test
    public void testBatteryConstructor(){
        Battery testbat = new Battery(true);
        Assertions.assertNotNull(testbat);
    }


    @Test
    public void testUsePower(){
        Battery testbat = new Battery(true);
        testbat.usePower(5);
        Assertions.assertEquals(testbat.getPower(), 95);

        testbat.usePower(5000);
        Assertions.assertEquals(testbat.getPower(), 0);
    }

    @Test
    public void testRechargeBattery(){
        Battery testbat = new Battery(true);
        testbat.usePower(15);
        Assertions.assertEquals(testbat.getPower(), 85);
        testbat.rechargeBattery(5);
        Assertions.assertEquals(testbat.getPower(), 90);
        testbat.rechargeBattery(1000);
        Assertions.assertEquals(testbat.getPower(), 100);




        testbat = new Battery(false);
        testbat.usePower(33);
        Assertions.assertEquals(testbat.getPower(), 67);
        testbat.rechargeBattery(7);
        Assertions.assertNotEquals(testbat.getPower(), 74);
        Assertions.assertEquals(testbat.getPower(), 67);
    }

}
