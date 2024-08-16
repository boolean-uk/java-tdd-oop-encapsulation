package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoteControlledCar {

    @Test
    public void testRCCarConstructor(){
        RemoteControlledCar rc = new RemoteControlledCar("Black");
    }

    @Test
    public void testsetCarColor(){
        RemoteControlledCar rc = new RemoteControlledCar("Black");
        Assertions.assertEquals(rc.getCarColor(), "Black");
        rc.setCarColor("Blue with white flames");
        Assertions.assertEquals(rc.getCarColor(), "Blue with white flames");
    }

    @Test
    public void testFacingDirection(){
        RemoteControlledCar rc = new RemoteControlledCar("Black");

        Assertions.assertEquals(rc.getDirectionInDegrees(), 0);
        rc.turnDirectionToRight(90);
        Assertions.assertEquals(rc.getDirectionInDegrees(), 90);


        rc.turnDirectionToLeft(13);
        Assertions.assertEquals(rc.getDirectionInDegrees(), 77);

    }

}
