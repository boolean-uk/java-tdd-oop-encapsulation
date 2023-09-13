# Domain Model
Create a Domain Model that covers the user stories below

## User Stories
I have a remote controlled car:
1. I want to be able to decide on the colour of the car.
2. I want to be able to choose between rechargeable and disposable batteries.
3. I want to choose between a simple and an advanced remote control.
4. I want to be able to see the battery percentage remaining.
5. I want to be able to move the car forward and backward a specific distance.
6. I want to be able to stop the car from moving.
7. I want to be able to turn the car left and right.
8. I want to be able to replace the battery with either kind as needed.

### Battery Class

| Method          | Attributes             | Scenario                   | Outcome |
|-----------------|------------------------|----------------------------|---------|
| getType()       | boolean isRechargeable | Get the battery type       | Boolean |
| getPercentage() | int percentage         | Get the battery percentage | int     |

### Remote Controlled Car

| Method                  | Attributes                   | Scenario                           | Outcome                        |
|-------------------------|------------------------------|------------------------------------|--------------------------------|
| setColour(String)       | String colour                | 1.Set car's colour                 | No Return Value, Print Message |
| setBattery(Battery)     | Battery battery              | 2,8.Set/Replace car's battery type | No Return Value, Print Message |
| setController(boolean)  | boolean controllerIsAdvanced | 3.Set car's controller type        | No return Value, Print Message |
| viewBatteryPercentage() |                              | 4.View battery's percentage        | int                            |
| moveForward(int)        |                              | 5.Move forward specific distance   | No return Value, Print Message | 
| moveBackwards(int)      |                              | 5.Move backwards specific distance | No return Value, Print Message |
| stopMoving()            |                              | 6.Stop car from moving             | No return Value, Print Message |
| turnLeft()              |                              | 7.Turn the car left                | No return Value, Print Message |
| turnRight()             |                              | 7.Turn the car right               | No return Value, Print Message |

