package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControlTest {

    @Test
    public void setControl() {
        Control control = new Control();
        String control1 = "";
        String control2 = "simple";
        String control3 = "advanced";
        String control4 = "dhkjfd";

        Assertions.assertFalse(control.setControl(control1));
        Assertions.assertFalse(control.setControl(control4));
        Assertions.assertTrue(control.setControl(control2));
        Assertions.assertTrue(control.setControl(control3));
    }
}
