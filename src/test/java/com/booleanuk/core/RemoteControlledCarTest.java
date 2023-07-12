package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.booleanuk.core.RemoteControlledCar.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoteControlledCarTest {
    RemoteControlledCar car;

    @BeforeEach
    void setUp() {
        car = new RemoteControlledCar("blue", false, false, 100);
    }

    @Test
    void moveForwardMovesTheCarForward() {
        int distance = 10;
        assertEquals(car.moveForward(distance), VEHICLE_FORWARD + " " + distance);
    }

    @Test
    void moveBackwardsMovesTheCarForward() {
        int distance = 10;
        assertEquals(car.moveBackwards(10), VEHICLE_BACKWARD + " " + distance);
    }

    @Test
    void stopStopsCar() {
        assertEquals(VEHICLE_STOPPED, car.stop());
    }

    @Test
    void turnLeftCarTurnsLeftForAdvancedRemote() {
        car.changeRemoteControllerAdvanced();
        assertEquals(car.turnLeft(), VEHICLE_LEFT);
    }

    @Test
    void turnLeftCarNotTurnsLeftForBasicRemote() {
        assertEquals(car.turnLeft(), ADVANCED_OPTION);
    }

    @Test
    void turnLeftCarTurnsRightForAdvancedRemote() {
        car.changeRemoteControllerAdvanced();
        assertEquals(car.turnRight(), VEHICLE_RIGHT);
    }

    @Test
    void turnLeftCarNotTurnsRightForBasicRemote() {
        assertEquals(car.turnRight(), ADVANCED_OPTION);
    }


}