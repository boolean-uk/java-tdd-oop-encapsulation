## Domain model Exercise 2

Class Car:

| Member Variables  | Methods                                   | Scenario          | Output  |
|-------------------|-------------------------------------------|-------------------|---------|
| String color      | setColor(String color)                    | Valid color input | true    |
| Battery battery   |                                           | Invalid input     | false   |
| Control control   | setBattery(Battery battery)               |                   | void    |
| String direction? |                                           |                   |         |
| boolean isMoving? | setControl(Control control)               |                   | void    |
|                   |                                           |                   |         |
|                   | getBatteryPercentage()                    |                   | int     |
|                   |                                           |                   |         |
|                   | moveCar(String direction, int kilometers) |                   | String  |
|                   |                                           |                   |         |
|                   | stopCar()                                 |                   | boolean |
|                   |                                           |                   |         |
|                   | turnCar(String direction)                 |                   | String  |
|                   |                                           |                   |         |
|                   |                                           |                   |         |
|                   |                                           |                   |         |
|                   |                                           |                   |         |

Class Battery

| Member Variables | Methods   | Scenario | Output |
|------------------|-----------|----------|--------|
| String type      | getters   |          | String |
| int percentage   |           |          | int    |
|                  | setters   |          | void   |

Class Control

| Member Variables   | Methods | Scenario | Output  |
|--------------------|---------|----------|---------|
| boolean isAdvanced | getter  |          | boolean |
|                    |         |          | boolean |
|                    | setter  |          | void    |
