```I have a remote controlled car:```

RemoteCar

| method      | object attribute      | context                         | output/return |
|-------------|-----------------------|---------------------------------|---------------|
| RemoteCar() | String color          | constructor for class remoteCar | (remoteCar)   |
|             | Battery battery       |                                 |               |
|             | Controller controller |                                 |               |

---
```I want to be able to decide on the colour of the car.```

RemoteCar

| method                 | object attribute | context                                  | output/return |
|------------------------|------------------|------------------------------------------|---------------|
| setColor(String color) | String color     | sets attribute color to the given String |               |


---
```I want to be able to choose between rechargable and disposable batteries.```

Battery

| method                    | object attribute | context                                                                                 | output/return |
|---------------------------|------------------|-----------------------------------------------------------------------------------------|---------------|
| setType(BatteryType type) | BatteryType type | sets attribute BatteryType to either rechargeable or disposable. BatteryType is an Enum |               |

---
```I want to choose between a simple and an advanced remote control.```

Controller

| method                  | object attribute    | context                                                                               | output/return |
|-------------------------|---------------------|---------------------------------------------------------------------------------------|---------------|
| setType(ControllerType) | ControllerType type | sets attribute ControllerType to either simple or advanced. ControllerType is an Enum |               |

---
```I want to be able to see the battery percentage remaining.```

Battery

| method                 | object attribute      | context                          | output/return |
|------------------------|-----------------------|----------------------------------|---------------|
| getBatteryPercentage() | int batteryPercentage | get method for batteryPercentage |               |

---
```I want to be able to move the car forward and backward a specific distance.```

RemoteCar

| method                      | object attribute | context                                                           | output/return     |
|-----------------------------|------------------|-------------------------------------------------------------------|-------------------|
| moveFrontBack(int distance) | int[1] direction | uses int[1] to find the direction to move. Adds distance to Point | Point newPosition |
|                             | Point position   |                                                                   |                   |



---
```I want to be able to stop the car from moving.```

RemoteCar

| method | object attribute | context | output/return |
|--------|------------------|---------|---------------|
| stop() |                  |         |               |
|        |                  |         |               |

---
```I want to be able to turn the car left and right.```

RemoteCar

| method              | object attribute | context                  | output/return        |
|---------------------|------------------|--------------------------|----------------------|
| turn(int turnValue) | int[] direction  | Adds turnValue to int[]. | (int[]) newDirection |
|                     |                  |                          |                      |

---
```I want to be able to replace the battery with either kind as needed.```

Battery

| method                       | object attribute | context                                                                       | output/return |
|------------------------------|------------------|-------------------------------------------------------------------------------|---------------|
| setBattery(BatteryType type) | BatteryType type | sets BatteryType to either rechargeable or disposable. BatteryType is an Enum |               |

