| Class    | Methods                                     | Scenario       | Outcome  |
|----------|---------------------------------------------|----------------|----------|
| Car      | changeControls()                            | set to simple  | simple   |
| -------  | -------------------------------------       | set to advance | advanced |
|          | moveCar(Int distance, bool isMovingForward) | true           | String   |
|          |                                             | false          | String   |
|          | brake()                                     |                | String   |
|          | turn(bool isTurningRight)                   | true           | String   |
|          |                                             | false          | String   |
|          | replaceBattery(Battery batteryType)         | rechargable    | String   |
|          |                                             | disposable     | String   |
| Battery  | getBatteryPercentage()                      | gets %battery  | integer  |
|          |                                             |                |          |
