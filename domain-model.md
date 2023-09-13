## Exercise 2

Create a class diagram for the below user stories and then create real classes for them in the `./src/main/java/com/booleanuk/core` directory. Follow a test driven development approach, adding test classes to the `./src/test/java/com/booleanuk/core` directory.

Note that there is no "one correct way" to complete this exercise, this is an opportunity to practice designing and implementing a simple system. Making mistakes is expected and encouraged.

Additionally, don't worry about creating complex logic. The focus of this exercise is at an encapsulation level, we don't need to see a method that can actually recharge a lithium battery!

```
I have a remote controlled car:

I want to be able to decide on the colour of the car.

I want to be able to choose between rechargable and disposable batteries.

I want to choose between a simple and an advanced remote control.

I want to be able to see the battery percentage remaining.

I want to be able to move the car forward and backward a specific distance.

I want to be able to stop the car from moving.

I want to be able to turn the car left and right.

I want to be able to replace the battery with either kind as needed.
```

| Classes             | Methods                             | Member Variables                  | Scenario                             | Results                                    |
|---------------------|-------------------------------------|-----------------------------------|--------------------------------------|--------------------------------------------|
| RemoteControlledCar | setColour()                         | String colour                     | 1. Choose a colour of the car        | Change Car colour                          |
|                     |                                     |                                   |                                      |                                            |
|                     | setRemoteControl()                  | boolean advancedRemoteControl     | 3. Choose remote control if          | Change remote control                      |
|                     |                                     |                                   |                                      | return true                                |
|                     |                                     |                                   |                                      |                                            |
|                     | moveDirection()                     | String direction, double distance | 5. Move the car forward and backward | the car moves in direction, given distance |
|                     |                                     |                                   |                                      |                                            |
|                     | carBrake()                          | boolean brake                     | 6. Stop the car                      | return true                                |
|                     |                                     |                                   |                                      |                                            |
|                     | turnLeft()                          | boolean left                      | 7. turn left                         | return true                                |
|                     | turnRight()                         | boolean right                     | turn right                           | return true                                |
|                     |                                     |                                   |                                      |                                            |
|                     | replaceBattery(newBattery: battery) |                                   | 8. Replace batteries                 | change battery                             |
|                     |                                     |                                   |                                      |                                            |
| Battery             | setBattery()                        | boolean batteryType               | 2. Choose battery type               | Change Battery type                        |
|                     |                                     |                                   |                                      | return true                                |
|                     |                                     |                                   |                                      |                                            |
|                     | getBatteryPercentage()              | int batteryPercentage             | 4. see remaining battery percentage  | output remaining battery percentage        |
|                     |                                     |                                   |                                      |                                            |
