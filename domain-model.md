# Domain Model Exercise 2

## User Stories
```
I have a remote controlled car:

I want to be able to decide on the colour of the car.

I want to be able to choose between rechargable and disposable batteries.

I want to choose between a simple and an advanced remote control.

I want to be able to see the battery percentage remaining.

I want to be able to move the car forward and backward a specific distance.

I want to be able to stop the car from moving.

I want to be able to turn the car left and right.

I want to be able to replace the battery with either kind as needed.
```
### Class Car

| Method                                      | Members             | Scenario         | Return                   |
|---------------------------------------------|---------------------|------------------|--------------------------|
|                                             | String color        |                  |                          |
|                                             | String battery      |                  |                          |
|                                             | String  controlType |                  |                          |
| moveStraight(boolean forward, int distance) |                     | Car moves        | True                     |
|                                             |                     | Car stuck        | False                    |
| stopCar()                                   |                     | Car stops        | True                     |
|                                             |                     | Car not stopping | False                    |
| turnCar(boolean right)                      |                     | Car turns right  | String "Car turns right" |
|                                             |                     | Car turns left   | String "Car turns left"  |
### Class Battery
| Method                               | Members        | Scenario         | Return                           |
|--------------------------------------|----------------|------------------|----------------------------------|
| rechargeable(Boolean rechargeable)   | String battery | Set rechargeable | String "Battery is rechargeable" |
|                                      |                | Set disposable   | String "Battery is disposable"   |
| percentage()                         | int percentage | Show percentage  | int percentage                   |
| replaceBattery(Boolean reachable )   | String battery | Set rechargeable | String "Battery is rechargeable" |
|                                      |                | Set disposable   | String "Battery is disposable"   |
