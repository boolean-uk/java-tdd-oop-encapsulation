| Class | Members                   | Methods                              | Scenario                                               | Outputs |
|-------|---------------------------|--------------------------------------|--------------------------------------------------------|---------|
| `Car` | `color`                   | `showBatteryLevel()`                 | shows battery level                                    | String  |
|       | `isRechargable`           | `move(char direction, int distance)` | car moves in given direction                           | String  |
|       |                           |                                      | direction is invalid                                   | String  |
|       |                           |                                      | distance is invalid                                    | String  |
|       | `isRemoteControlAdvanced` | `stop()`                             | car stops                                              | String  |
|       |                           | `turn(char direction)`               | car turns in given direction                           | String  |
|       |                           |                                      | direction is invalid                                   | String  |
|       |                           | `changeBattery()`                    | if battery is rechargeable then battery is recharged   | String  |
|       |                           |                                      | if battery is not rechargeable then battery is changed | String  |
