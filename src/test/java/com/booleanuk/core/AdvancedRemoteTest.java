package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdvancedRemoteTest {
    @Test
    void inputLeftShouldBeLeft() {
        AdvancedRemote remote = new AdvancedRemote();
        RemoteCar remoteCar = new RemoteCar(remote);

        Assertions.assertEquals("None", remoteCar.getLastCommand());

        remote.inputLeft();

        Assertions.assertEquals("Left", remoteCar.getLastCommand());
    }
    @Test
    void inputRightShouldBeRight() {
        AdvancedRemote remote = new AdvancedRemote();
        RemoteCar remoteCar = new RemoteCar(remote);

        Assertions.assertEquals("None", remoteCar.getLastCommand());

        remote.inputRight();

        Assertions.assertEquals("Right", remoteCar.getLastCommand());
    }
}
