| Class               | Attributes             | Method                            | Scenario                          | Output | 
|---------------------|------------------------|-----------------------------------|-----------------------------------|--------|
| RemoteCar           | Colour class           | chooseColour(Colour newColour)    | sets the colour                   | void   | 
|                     | Battery class          | changeBattery(Battery newBattery) | sets battery to changed           | void   |
|                     | RemoteControl class    | command(String command)           | move the car forward and backward | void   |
| Colour              | String name            |                                   |                                   | void   |
|                     | String hex             |                                   |                                   |        |
| Battery             | int energy             |                                   |                                   | void   |
| DisposableBattery   | int energy             |                                   |                                   |        |       
| RechargeableBattery | int energy             |                                   |                                   |        |        
| SimpleRemote        |                        | inputForward()                    |                                   | void   |
|                     |                        | inputBackward()                   |                                   | void   |
|                     |                        | inputStop()                       |                                   | void   |
| AdvancedRemote      |                        | inputForward()                    |                                   | void   |
|                     |                        | inputBackward()                   |                                   | void   |
|                     |                        | inputStop()                       |                                   | void   |
|                     |                        | inputLeft()                       |                                   | void   |
|                     |                        | inputRight()                      |                                   | void   |
