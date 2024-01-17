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

| Classes | Methods                     | Scenarios                         | Variables          |
|---------|-----------------------------|-----------------------------------|--------------------|
| Car     | setColour(String colour)    | set colour of car                 | car.colour         |
|         | setControlType(String type) | set control type for car          | car.type           |
|         | forward(double distance)    | move forward distance in meter    | car.speed          |
|         | backwards(double distance)  | move backwards distance in meters | car.speed          |
|         | break()                     | stop all movement                 | car.speed          |
|         | turnLeft(double degrees)    | turn left amount of degrees       | car.turnAngle      |
|         | turnRight(double degrees)   | turn right amount of degrees      | car.turnAngle      |
|         | setBattery(Battery battery) | change battery to new battery     | car.battery        |
| Battery | Battery(String type)        | set battery type for battery      | battery.type       |
|         | getBatteryPercentage()      | get current battery percentage    | battery.percentage |
|         |                             |                                   |                    |
