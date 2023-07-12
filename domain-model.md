| Classes | Members                     | Methods                                   | Scenario                                | Outputs           |
|---------|-----------------------------|-------------------------------------------|-----------------------------------------|-------------------|
| `Car`   | `Colour colour`             | `double getBatteryPercentage()`           | Get current battery level               | battery level     |
|         | `Battery battery`           | `int moveForward(int distance)`           | Move car forward by specified distance  | traveled distance |
|         | `ControlType controlType`   | `int moveBackward(int distance)`          | Move car backward by specified distance | traveled distance |
|         | `boolean isMoving`          | `void stopCar()`                          | Stop car from moving                    |                   |
|         | `Direction movingDirection` | `void turnLeft()`                         | Change moving direction to left         |                   |
|         |                             | `void turnRight()`                        | Change moving direction to right        |                   |
|         |                             | `void replaceBattery(Battery newBattery)` | Change battery                          |                   |

| Classes   | Members                   | Methods | Scenario | Outputs |
|-----------|---------------------------|---------|----------|---------|
| `Battery` | `BatteryType batteryType` |         |          |         |
|           | `double batteryLevel`     |         |          |         |


