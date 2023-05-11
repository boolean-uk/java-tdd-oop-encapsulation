package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteCarTest {
    @Test
    void chooseColourShouldBeNewColour() {
        RemoteCar remoteCar = new RemoteCar();

        Assertions.assertNull(remoteCar.getColour());

        Colour colour = new Colour();
        remoteCar.chooseColour(colour);

        Assertions.assertEquals(colour, remoteCar.getColour());
    }
    @Test
    void changeBatteryShouldBeNewBattery() {
        RemoteCar remoteCar = new RemoteCar();

        Assertions.assertNull(remoteCar.getBattery());

        Battery battery = new DisposableBattery();
        remoteCar.changeBattery(battery);

        Assertions.assertEquals(battery, remoteCar.getBattery());
    }
    @Test
    void commandShouldBeLastCommand() {
        RemoteCar remoteCar = new RemoteCar();

        Assertions.assertEquals("None", remoteCar.getLastCommand());

        remoteCar.command("Forward");

        Assertions.assertEquals("Forward", remoteCar.getLastCommand());
    }
}
