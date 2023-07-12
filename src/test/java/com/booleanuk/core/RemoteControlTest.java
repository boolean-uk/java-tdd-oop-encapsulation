package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlTest {

    RemoteControl remoteControl;
    public RemoteControlTest() {
        this.remoteControl = new RemoteControl("advanced");
    }

    @Test
    public getTypeTest() {
        Assertions.assertEquals("advanced", remoteControl.getTypeControl());
    }
}
