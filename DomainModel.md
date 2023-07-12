# User Stories
(1) I want to be able to decide on the colour of the car.

(2) I want to be able to choose between rechargeable and disposable batteries.

(3) I want to choose between a simple and an advanced remote control.

(4) I want to be able to see the battery percentage remaining.

(5) I want to be able to move the car forward and backward a specific distance.

(6) I want to be able to stop the car from moving.

(7) I want to be able to turn the car left and right.

(8) I want to be able to replace the battery with either kind as needed.

# Car
## Applicable User Stories:
(1) I want to be able to decide on the colour of the car.

(2) I want to be able to choose between rechargeable and disposable batteries.

(4) I want to be able to see the battery percentage remaining.

(8) I want to be able to replace the battery with either kind as needed.

## Domain Model:

| Members               | Methods                  | Scenarios                                       | Outcome/ Output                                                   | User Story |
|-----------------------|--------------------------|-------------------------------------------------|-------------------------------------------------------------------|------------|
| String colour         |                          |                                                 |                                                                   | 1          |
| boolean rechargeable  |                          |                                                 |                                                                   | 2          |
| int batteryPercentage |                          |                                                 |                                                                   | 4          |
|                       | boolean replaceBattery() | The battery has been replaced successfully.     | Print message that battery has been replaced and return true      | 8          |
|                       |                          | The battery has not been replaced successfully. | Print message that battery has not been replaced and return false | 8          |
|                       |                          |                                                 |                                                                   |            |


# Remote
## Applicable User Stories:
(3) I want to choose between a simple and an advanced remote control.

## Domain Model:

| Members            | Methods | Scenarios | Outcome/ Output | User Story |
|--------------------|---------|-----------|-----------------|------------|
| boolean remoteType |         |           |                 | 3          |



# CarMovement
## Applicable User Stories:
(5) I want to be able to move the car forward and backward a specific distance.

(6) I want to be able to stop the car from moving.

(7) I want to be able to turn the car left and right.

## Domain Model:

| Members | Methods                            | Scenarios                       | Outcome/ Output                                                                    | User Story |
|---------|------------------------------------|---------------------------------|------------------------------------------------------------------------------------|------------|
| Car car |                                    |                                 |                                                                                    |            |
|         | boolean moveForward(int distance)  | Car moves forward successfully  | Print message that car has moved forward a specific distance and return true       | 5          |
|         |                                    | Car does not move forward       | Print message that car has not moved forward a specific distance and return false  | 5          |
|         | boolean moveBackward(int distance) | Car moves backward successfully | Print message that car has moved backward a specific distance and return true      | 5          |
|         |                                    | Car does not move backward      | Print message that car has not moved backward a specific distance and return false | 5          |
|         | boolean stopCar()                  | Car stops successfully          | Print message that car has stopped and return true                                 | 6          |
|         |                                    | Car does not stop               | Print message that car has not stopped and return false                            | 6          |
|         | boolean turnLeft()                 | Car turns left successfully     | Print message that car has turned left and return true                             | 7          |
|         |                                    | Car does not turn left          | Print message that car has not turned left and return false                        | 7          |
|         | boolean turnRight()                | Car turns right successfully    | Print message that car has turned right and return true                            | 7          |
|         |                                    | Car does not turn right         | Print message that car has not turned right and return false                       | 7          |
