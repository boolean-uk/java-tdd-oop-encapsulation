package com.booleanuk.core;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

@Data
@AllArgsConstructor
public class Car {
    private Color color;
    private Battery battery;
    private boolean advancedControl;

    public void move(int speed, int degree) {
        // -> Turn wheels to degree
        // -> Set speed to speed

        // These values would be passed directly to the car or smthing
    }
}
