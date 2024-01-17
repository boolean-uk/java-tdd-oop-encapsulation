package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {

    private final static RemoteControlledCar CAR =
            new RemoteControlledCar("black", BatteryType.DISPOSABLE, false);

    @Test
    void move_ShouldMoveTenForward(){
        Assertions.assertDoesNotThrow(() ->CAR.move(10, Direction.FORWARD));
    }

    @Test
    void move_ShouldNotMoveTenForwardWrongDirection(){
        Assertions.assertThrows(IllegalStateException.class,() ->CAR.move(10, Direction.LEFT));
        Assertions.assertThrows(IllegalStateException.class,() ->CAR.move(10, Direction.RIGHT));
    }

    @Test
    void move_ShouldMoveLeftOrRight(){
        Assertions.assertDoesNotThrow(() -> CAR.move(Direction.LEFT));
        Assertions.assertDoesNotThrow(() -> CAR.move(Direction.RIGHT));

        CAR.move(Direction.RIGHT);
        Assertions.assertEquals(1,CAR.getWheelsPosition());
        CAR.move(Direction.LEFT);
        Assertions.assertEquals(-1,CAR.getWheelsPosition());

        Assertions.assertDoesNotThrow(() -> CAR.move(Direction.RIGHT));

        Assertions.assertThrows(IllegalStateException.class, () -> CAR.move(Direction.FORWARD));
        Assertions.assertThrows(IllegalStateException.class, () -> CAR.move(Direction.BACKWARD));
    }

    @Test
    void replaceBattery_ShouldChangeBattery(){
        BatteryType batteryType = BatteryType.RECHARGEABLE;
        CAR.replaceBattery(batteryType);
        double expectedBatteryPercentage = 100;

        Assertions.assertEquals(batteryType, CAR.getBatteryType());
        Assertions.assertEquals(expectedBatteryPercentage, CAR.getBatteryPercentage());
    }
}
