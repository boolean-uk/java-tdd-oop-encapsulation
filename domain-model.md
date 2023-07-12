# Car

| Class name | Fields        | Methods                 | Scenario                   | Output                           |
|------------|---------------|-------------------------|----------------------------|----------------------------------|
| Car        | Color:String  |                         |                            |                                  |
|            |               | pickColor(String color) | color didn't picked        | return default color black       |
|            | Battery: enum |                         | color picked up            | return color;                    |
|            |               | chooseBattery(enum)     |                            |                                  |
|            |               |                         | picked rechargable         | return 'Rechargable picked`;     |
|            |               |                         | picked desposable          | return 'Disposable picked';      |
|            |               | batteryPercentage()     | show how many percent left | return 'Battery percentage' ;    |
|            |               | replaceBattery(enum)    | pick the new battery       | return 'New battery' ;           |
|            |               |                         |                            |                                  |
|            |               | move(int distance)      | if there is no battery     | return 'Charge battery please' ; |
|            |               |                         | if there is battery        | return 'Moved to that place';    |
|            |               | stop()                  | stop the car if moving     | return 'Car stopped' ;           |
|            |               |                         |                            |                                  |
|            |               | turn(String direction)  | if left                    | return 'Turning to left';        |
|            |               |                         | if right                   | return 'Turning right'  ;        |
