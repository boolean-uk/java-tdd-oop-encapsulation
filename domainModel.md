| Class         | attributes                               | methods                               | scenario                              | output |
|---------------|------------------------------------------|---------------------------------------|---------------------------------------|--------|
| RemoteControl | String type, ControlledCar controlledCar | moveForward (int distance)            | move forward if possible              | true   |
|               |                                          |                                       | don't move if not possible            | false  |
|               |                                          | moveBackward (int distance) : boolean | move forward if possible              | true   |
|               |                                          |                                       | don't move if not possible            | false  |
|               |                                          | stop () : boolean                     | stop if possible                      | true   |
|               |                                          |                                       | don't stop if not possible            | false  |
|               |                                          | turnLeft() : boolean                  | turn left if possible                 | true   |
|               |                                          |                                       | don't turn left if not possible       | false  |
|               |                                          | turnRight () : boolean                | turn right if possible                | true   |
|               |                                          |                                       | don't turn right if not possible      | false  |
|               |                                          |                                       |                                       |        |
| ControlledCar | String colour, Battery battery           |                                       |                                       |        |
|               |                                          |                                       |                                       |        |
| Battery       | String type, int percentage              | replace() : boolean                   | replace battery if possible           | true   |
|               |                                          |                                       | don't replace battery if not possible | false  |
