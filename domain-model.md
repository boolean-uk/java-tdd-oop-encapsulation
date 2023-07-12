| Classes | Members                 | Methods                        | Scenario                                                         | Output             |
|---------|-------------------------|--------------------------------|------------------------------------------------------------------|--------------------|
| Car     | String colour           | moveForward(double distance)   | print "Move forward " with the given distance                    | -                  |
|         | Battery battery         | moveBackward(double distance)  | print "Move backward " with the given distance                   | -                  |
|         | ControlType controlType | stopTheCar()                   | print "Car is stopped"                                           | -                  |
|         |                         | turnLeft()                     | print "Turn left"                                                | -                  |
|         |                         | turnRight()                    | print "Turn right"                                               |                    |
| Battery | BatteryType type        | isBatteryToReplace()           | if percentage is less than 10%                                   | true               |
|         | double percentage       |                                | if percentage is more than 10%                                   | false              |
|         |                         | changeTheDisposableBattery()   | if isBatteryToReplace return true, change the battery to new one | -                  |
|         |                         | chargeTheRechargeableBattery() | if isBatteryToReplace return true, charge the battery to 100%    |                    |
|         |                         | showBatteryPercentage()        | show battery percentage                                          | double: percentage |

| Enum        | Values                   |
|-------------|--------------------------|
| BatteryType | RECHARGEABLE, DISPOSABLE |
| ControlType | SIMPLE, ADVANCED         |