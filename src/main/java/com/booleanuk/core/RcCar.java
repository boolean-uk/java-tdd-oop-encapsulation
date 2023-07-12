package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@AllArgsConstructor
@Builder
@Getter
public class RcCar {
    private static final int BATTERY_DRAIN = 1;

    private double distanceTravelled;
    @Setter
    private Color color;
    @Setter
    private BatteryType batteryType;
    private final RcType rcType;
    private int batteryPercentage;
    @Setter
    private Direction direction;

    public void move(double distance) {
        this.distanceTravelled += distance;
        this.batteryPercentage -= BATTERY_DRAIN * distance;
    }

    public void replaceBatteries(BatteryType type) {
        this.batteryType = type;
        this.batteryPercentage = 100;
    }
}
