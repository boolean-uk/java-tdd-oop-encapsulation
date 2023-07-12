| Class            | Attributes                        | Methods                      | Scenarios                                  | Output |
|------------------|-----------------------------------|------------------------------|--------------------------------------------|--------|
| Car              | String colour                     | changeColour(String colour)  | user wants to change the colour of the car | void   |
|                  | Battery battery                   | batteryChargeStatus()        | user wants to know battery charge status   | int    |
|                  | RemoteController remoteController | turnLeft()                   | user wants to turn the car to the left     | String |
|                  | int distance                      | turnRight()                  | user wants to turn the car to the right    | String |
|                  |                                   | moveForward(distance: int)   | user wants to drive forward                | String |
|                  |                                   | moveBackwards(distance: int) | user wants to drive backwards              | String |
|                  |                                   | stopDriving()                | user wants to stop the car                 | String |
|                  |                                   | replaceBattery(String type)  | user wants to replace the battery          | void   |
| Battery          | String type                       |                              |                                            |        |
|                  | int chargeStatus                  |                              |                                            |        |
| RemoteController | String type                       |                              |                                            |        |
