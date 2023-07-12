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

| Classes | Methods                                | Attributes                   | Output  |
|---------|----------------------------------------|------------------------------|---------|
| Car     | changeColor(String color)              | String color                 | boolean |
|         | chooseBattery(boolean isRechargable)   | boolean isBatteryRechargable | boolean |
|         | chooseControlType(boolean isAdvanced)  | boolean isAdvanced           | boolean |
|         | getBatteryPercentage()                 | int batteryPercentage        | int     |
|         | moveCar( boolean forward, int distance) | int[] location               | int[]   |
|         | stopCar()                              |                              | boolean |
|         | turnCar (boolean left)                 |                              | boolean |
|         | replaceBattery(boolean isRechargable)  |                              | boolean |
