package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;

import java.awt.*;

@AllArgsConstructor
@Builder
public class RcCar {
    private static final int BATTERY_DRAIN = 1;

    private double distanceTravelled;
    @Setter
    private Color color;
    @Setter
    private BatteryType batteries;
    private final RcType rcType;
    private short batteryPercentage;
    @Setter
    private Direction direction;

    public void move(double distance) {
        this.batteryPercentage -= BATTERY_DRAIN * distance;
    }
}
