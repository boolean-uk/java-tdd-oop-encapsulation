package com.booleanuk.core;

public class Control {

    String typeControl;

    public boolean setControl(String newTypeControl) {
        if (newTypeControl.equals("simple") || newTypeControl.equals("advanced")) {
            this.typeControl = newTypeControl;
            return true;
        }
        return false;
    }
}
