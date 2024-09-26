# Domain Model

| Class       | Methods                         | Fields                 | Scenario                                         | Output                                                       |
|-------------|---------------------------------|------------------------|--------------------------------------------------|--------------------------------------------------------------|
| BatteryType |                                 | Rechargeable           |                                                  |                                                              |
|             |                                 | Disposable             |                                                  |                                                              |
| RemoteType  |                                 | Simple                 |                                                  |                                                              |
|             |                                 | Advanced               |                                                  |                                                              |
| Car         | setColour(String colour)        | colour: String         | changes Colour                                   | prints new colour                                            |
|             | setBattery(BatteryType battery) | battery: BatteryType   | changes battery type                             | prints new battery                                           |
|             | setRemote(RemoteType remote)    | batteryPercentage: int | changes remote type                              | prints new remote type                                       |
|             | getBatteryPercentage()          | remote: RemoteType     | gets how much battery is left                    | returns int batteryPercentage                                |
|             | moveForward(int distance)       | distanceFromStart: int | moves car for provided number of metres forward  | prints information about distance travelled by this function |
|             | moveBackward(int distance)      | direction: String      | moves car for provided number of metres backward | prints information about distance travelled by this function |
|             | stop()                          |                        | if car stopped                                   | true                                                         |
|             |                                 |                        | if car didn't stop                               | false                                                        |
|             | turnLeft()                      |                        | changes direction to left                        | prints information about current direction                   |
|             | turnRight()                     |                        | changes direction to right                       | prints information about current direction                   |
