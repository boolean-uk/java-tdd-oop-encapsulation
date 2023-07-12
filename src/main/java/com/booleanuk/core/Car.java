package com.booleanuk.core;

public class Car {
    public enum Direction {
        North(1),
        South(-1),
        East(1),
        West(-1);
        public final int value;
        private Direction(int direction) {
            this.value = direction;
        }
    }
    public enum BatteryType {
        Rechargable(),
        Disposable();
    }
    public enum ControlType {
        Advanced(),
        Simple();
    }
    private String colour;
    private BatteryType batteryType;
    private ControlType controlType;
    private float batteryPercentage;
    private int X = 0;
    private int Y = 0;
    private Direction direction = Direction.North;
    public Car(String colour, BatteryType batteryType, ControlType controlType) {
        this.colour = colour;
        this.controlType = controlType;
        changeBatteries(batteryType);
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public float getBatteryPercentage() {
        return batteryPercentage;
    }
    public void changeBatteries(BatteryType newBatteryType) {
        batteryType = newBatteryType;
        batteryPercentage = 100;
    }
    public void move(int distance) {
        if (direction == Direction.North || direction == Direction.South)
            Y += direction.value * distance;
        else
            X += direction.value * distance;
        batteryPercentage -= Math.abs(distance) / 10f;
    }

    public void turn(boolean left) {
        switch (direction) {
            case North -> direction = left ? Direction.West : Direction.East;
            case West -> direction = left ? Direction.South : Direction.North;
            case South -> direction = left ? Direction.East : Direction.West;
            case East -> direction = left ? Direction.North : Direction.South;
        }

    }
}
