package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Battery {
    private final int capacity;
    private final boolean isRechargable;
    private int currentCharge;

    public double getPercentage() {
        return ((double) currentCharge / capacity) * 100;
    }
}
