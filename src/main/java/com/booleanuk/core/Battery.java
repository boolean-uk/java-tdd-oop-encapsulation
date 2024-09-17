package com.booleanuk.core;

public abstract class Battery {
    private int energy = 100;

    public int getEnergy() { return energy; }

    public void consumeEnergy(int amount) { }
}
