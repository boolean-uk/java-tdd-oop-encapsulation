package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleRemoteTest {
    @Test
    void inputForwardShouldBeForward() {
        SimpleRemote remote = new SimpleRemote();
        RemoteCar remoteCar = new RemoteCar(remote);

        Assertions.assertEquals("None", remoteCar.getLastCommand());

        remote.inputForward();

        Assertions.assertEquals("Forward", remoteCar.getLastCommand());
    }
    @Test
    void inputBackwardShouldBeBackward() {
        SimpleRemote remote = new SimpleRemote();
        RemoteCar remoteCar = new RemoteCar(remote);

        Assertions.assertEquals("None", remoteCar.getLastCommand());

        remote.inputBackward();

        Assertions.assertEquals("Backward", remoteCar.getLastCommand());
    }
    @Test
    void inputStopShouldBeStop() {
        SimpleRemote remote = new SimpleRemote();
        RemoteCar remoteCar = new RemoteCar(remote);

        Assertions.assertEquals("None", remoteCar.getLastCommand());

        remote.inputStop();

        Assertions.assertEquals("Stop", remoteCar.getLastCommand());
    }
}
