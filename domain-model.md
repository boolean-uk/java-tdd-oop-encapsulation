```
1. I want to be able to decide on the colour of the car.
```

| Classes | Methods                          | Scenario     | Returns |
|---------|----------------------------------|--------------|---------|
| Car     | String changeColor(String color) | Valid string | color   |
|         |                                  |              |         |


```
2. I want to be able to choose between rechargable and disposable batteries.
8. I want to be able to replace the battery with either kind as needed.
```

| Classes | Methods                    | Scenario               | Returns |
|---------|----------------------------|------------------------|---------|
| Car     | boolean replaceBattery()   | change to rechargeable | true    |
|         |                            | change to disposable   | false   |

```
3. I want to choose between a simple and an advanced remote control.
```

| Classes | Methods                    | Scenario                     | Returns |
|---------|----------------------------|------------------------------|---------|
| Car     | boolean switchRemoteType() | want advanced remote control | true    |
|         |                            | want simple remote control   | false   |

```
4. I want to be able to see the battery percentage remaining.
```

| Classes | Methods                 | Scenario                       | Returns                     |
|---------|-------------------------|--------------------------------|-----------------------------|
| Car     | int batteryPercentage() | want to see battery percentage | int with remaining capacity |
|         |                         |                                |                             |

```
5. I want to be able to move the car forward and backward a specific distance.
```

| Classes | Methods                  | Scenario               | Returns |
|---------|--------------------------|------------------------|---------|
| Car     | boolean moveForward()    | want to move forward   | true    |
|         | boolean moveBackwards( ) | want to move backwards | true    |

```
6. I want to be able to stop the car from moving.
```

| Classes | Methods        | Scenario                          | Returns |
|---------|----------------|-----------------------------------|---------|
| Car     | boolean stop() | If car is moving and want to stop | true    |
|         |                | If car is already stopped         | false   |


```
7. I want to be able to turn the car left and right.
```

| Classes | Methods          | Scenario           | Returns |
|---------|------------------|--------------------|---------|
| Car     | void turnLeft()  | want to turn left  | true    |
|         | void turnRight() | want to move right | true    |