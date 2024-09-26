#Domain model for remote controlled car

###User stories
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

| Class     | Members                | Method                        | Scenarios                | Result/Output                 |
|-----------|------------------------|-------------------------------|--------------------------|-------------------------------|
| RemoteCar | HashMap<String,String> | String rechargeable(boolean)  | User wants to set        | Adds battery type             |
|           | carAttributes          |                               | battery type in car      | to attribute list             |
|           |                        |                               |                          | returns "Battery added".      |
|           |                        |                               |                          |                               |
|           |                        | String advanced(boolean)      | User wants to select     | Adds steering type to         |
|           |                        |                               | between advanced or      | attribute list.               |
|           |                        |                               | simple steering          | returns steering mode         |
|           |                        |                               |                          |                               |
|           |                        | String moveForward(boolean,   | User wants car to move   | Moves forward if true,        |
|           |                        | String                        | forward a set distance   | else moves backwards.         |
|           |                        |                               |                          | Adds distance to attribute    |
|           |                        |                               |                          | list.                         |
|           |                        |                               |                          |                               |
|           |                        | String turnLeft(boolean)      | User wants to turn left  | if boolean is ture, return    |
|           |                        |                               | or right                 | turn left. else turn right    |
|           |                        |                               |                          |                               |
|           |                        | String changeColour(String)   | User wants to change the | returns "Colour changed to" + |
|           |                        |                               | colour of the car        | colour. Adds colour to        |
|           |                        |                               |                          | attribute list                |
|           |                        |                               |                          |                               |
|           |                        | String stop()                 | User wants the car to    | returns "Stopping"            |
|           |                        |                               | stop                     |                               |
|           |                        |                               |                          |                               |
|           |                        | String changeBattery(boolean) | User wants to change the | returns "Battery changed".    |
|           |                        |                               | battery                  |                               |
|           |                        |                               |                          |                               |
|           |                        | String [] carStatus()         | User wants to see the    | returns a string[] containing |
|           |                        |                               | car attribute values     | the keys and values           |
