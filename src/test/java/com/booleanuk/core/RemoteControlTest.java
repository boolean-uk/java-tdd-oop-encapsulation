package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlTest {
    @Test
    public void testChangeType(){
        Car car = new Car();

        Assertions.assertEquals("Remote control is now 'advanced'",car.remoteControl.changeType(true));
        Assertions.assertEquals("Remote control is now 'simple'",car.remoteControl.changeType(false));
    }
}
