
| Classes     | Methods                         | Scenario                                                    | Outputs              |
|-------------|---------------------------------|-------------------------------------------------------------|----------------------|
| `RemoteCar` | `changeCar(String color)`       | The color is different than current one                     | True                 |
|             |                                 | The color is the same                                       | False                |
|             | `chooseBattery(String battery)` | The battery is "rechargable" or "disposable"                | True                 |
|             |                                 | Non-existing battery                                        | False                |
|             | `changeControl(String control)` | The control type is "advanced" or "simple"                  | True                 |
|             |                                 | Non-existing control type                                   | False                |
|             | `batteryCheck()`                |                                                             | int                  |
|             | `moveCar(String direction)`     | The direction is "forward" or "backwards"                   | String               |
|             |                                 | Non-existing direction                                      | String error message |
|             | `stopCar()`                     |                                                             | String               |
|             | `turnCar(String direction)`     | The direction is "left" or "right"                          | String               |
|             |                                 | Non-existing direction                                      | String error message |
|             | `changeBattery()`               | Current battery is "rechargable" and needed is "disposable" | String               |
|             |                                 | Current battery is "disposable" and needed is "rechargable" | String               |
