## Car Class

| Attributes               | Methods                                       | Scenarios                  | Outcomes                   |
|--------------------------|-----------------------------------------------|----------------------------|----------------------------|
| String colour            |                                               |                            |                            |
| String batteryType       |                                               |                            |                            |
| String remoteControlType |                                               |                            |                            |
| int batteryRemaining     |                                               |                            |                            |
|                          | move(String direction, int distance): boolean | car able to move           | car moves, returns true    |
|                          |                                               | car can not move           | returns false              |
|                          | stop(): boolean                               | car is moving              | car stops, returns true    |
|                          |                                               | car is already stopped     | returns false              |
|                          | turn(String direction): boolean               | car turns                  | returns true               |
|                          | replaceBattery(String batteryType): void      | rechargeable or disposable | change battery             |
|                          | switchRemoteControlType(): void               | simple or advanced         | change remote control type |

