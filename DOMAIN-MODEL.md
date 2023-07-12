```
I have a remote controlled car:

1. I want to be able to decide on the colour of the car.

2. I want to be able to choose between rechargable and disposable batteries.

3. I want to choose between a simple and an advanced remote control.

4. I want to be able to see the battery percentage remaining.

5. I want to be able to move the car forward and backward a specific distance.

6. I want to be able to stop the car from moving.

7. I want to be able to turn the car left and right.

8. I want to be able to replace the battery with either kind as needed.
```

## Class RemoteControlledCar

| Fields                   | Methods                                       | Scenarios                                                            | Outputs/Outcomes                                               |
|--------------------------|-----------------------------------------------|----------------------------------------------------------------------|----------------------------------------------------------------|
| `color: String`          |                                               | User Story 1                                                         | Sets/Gets the color field of the RemoteControlledCar           |
| `batteryType: String`    |                                               | User Story 2                                                         | Sets/Gets the value of the batteryType field                   |
|                          |                                               | User Story 2 (Invalid Input)                                         | Informs the user that the given battery type is invalid        |
| `remoteType: String`     |                                               | User Story 3                                                         | Sets/Gets the value of the remoteType                          |
|                          |                                               | User Story 3 (Invalid Input)                                         | Informs the user that the given remote type is invalid         |
| `direction: String`      |                                               |                                                                      |                                                                |
| `isMoving: boolean`      |                                               | User Story 6                                                         | Sets/Gets the boolean value of the field                       |
| `batteryPercentage: int` |                                               |                                                                      |                                                                |
|                          |                                               |                                                                      |                                                                |
|                          | `displayBatteryPercentage(): void`            | User Story 4 (Battery percentage greater than 0)                     | Prints the remaining battery life with a '%' symbol at the end |
|                          |                                               | User Story 4 (Battery percentage is 0)                               | Prints 'Battery is empty. Closing...'                          |
|                          | `move(String direction): void`                | User Story 5,7 (Direction value is {forward, backward, left, right}) | Sets the direction field to the given String                   |
|                          |                                               | User Story 5,7 (Direction value is invalid)                          | Informs the user, that the given direction is invalid          |
|                          | `replaceBattery(String batteryType): boolean` | User Story 8 (batteryType is valid)                                  | Returns true, sets the batteryType to the given input          |
|                          |                                               | User Story 8 (batteryType is invalid)                                | Returns false, informs the user that the input is invalid      |

## UML Diagram

![](./assets/uml_diagram.jpg)