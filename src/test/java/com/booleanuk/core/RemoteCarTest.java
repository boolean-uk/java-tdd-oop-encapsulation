package com.booleanuk.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoteCarTest {
        @Test
        public void testRemoteCarFunctionality() {
            testSetCarColor();
            testSetBattery();
            testSetRemoteControl();
            testGetBatteryPercentage();
            testMoveForward();
            testMoveBackward();
            testStop();
            testTurnLeft();
            testTurnRight();
            testReplaceBattery();
            testChangeRemoteControlType();
            testChangeBatteryType();
        }

        private void testSetCarColor() {
            RemoteCar car = new RemoteCar();
            car.setColor("Red");
        }

        private void testSetBattery() {
            RemoteCar car = new RemoteCar();
            Battery battery = new Battery("Rechargeable");
            battery.setPercentageRemaining(50);
            car.setBattery(battery);
        }

        private void testSetRemoteControl() {
            RemoteCar car = new RemoteCar();
            RemoteControl remoteControl = new RemoteControl("Advanced");
            car.setRemoteControl(remoteControl);
        }

        private void testGetBatteryPercentage() {
            RemoteCar car = new RemoteCar();
            Battery battery = new Battery("Rechargeable");
            battery.setPercentageRemaining(50);
            car.setBattery(battery);
            int batteryPercentage = car.getBatteryPercentage();
            assertEquals(50, batteryPercentage);
        }

        private void testMoveForward() {
            RemoteCar car = new RemoteCar();
            // Additional setup if needed
            car.moveForward(10);
        }

        private void testMoveBackward() {
            RemoteCar car = new RemoteCar();
            car.moveBackward(5);
        }

        private void testStop() {
            RemoteCar car = new RemoteCar();
            car.stop();
        }

        private void testTurnLeft() {
            RemoteCar car = new RemoteCar();
            car.turnLeft();
        }

        private void testTurnRight() {
            RemoteCar car = new RemoteCar();
            car.turnRight();
        }

        private void testReplaceBattery() {
            RemoteCar car = new RemoteCar();
            Battery battery = new Battery("Rechargeable");
            car.setBattery(battery);
            Battery newBattery = new Battery("Disposable");
            car.replaceBattery(newBattery);
        }

        private void testChangeRemoteControlType() {
            RemoteCar car = new RemoteCar();
            RemoteControl remoteControl = new RemoteControl("Advanced");
            car.setRemoteControl(remoteControl);
            RemoteControl newRemoteControl = new RemoteControl("Simple");
            car.setRemoteControl(newRemoteControl);
        }

        private void testChangeBatteryType() {
            RemoteCar car = new RemoteCar();
            Battery battery = new Battery("Rechargeable");
            car.setBattery(battery);
            Battery newBattery = new Battery("Disposable");
            car.setBattery(newBattery);
        }
    }