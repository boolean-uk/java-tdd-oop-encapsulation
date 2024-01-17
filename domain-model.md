### Exercise 2 User Stories

# I have a remote controlled car:
1. I want to be able to decide on the colour of the car.

| Class               | Member variables | Methods                             | Scenario                                                       | Output/Result                          |
|---------------------|------------------|-------------------------------------|----------------------------------------------------------------|----------------------------------------|
| RemoteControlledCar | String carName   | String chooseCarColor(String color) | When I run the method I should be able to decide the car color | Returns a String stating the new color |
|                     | String carModel  |                                     |                                                                |                                        |


2. I want to be able to choose between rechargable and disposable batteries.

| Class                      | Member variables | Methods                                     | Scenario                                                                 | Output/Result                             |
|----------------------------|------------------|---------------------------------------------|--------------------------------------------------------------------------|-------------------------------------------|
| RemoteControlledCarBattery |                  | String chooseCarBattery(String batteryType) | When I run the method I should be able to decide the type of car battery | Returns a String stating new battery type |
|                            |                  |                                             |                                                                          |                                           |



3. I want to choose between a simple and an advanced remote control.

| Class               | Member variables | Methods                                                 | Scenario                                                                    | Output/Result                                        |
|---------------------|------------------|---------------------------------------------------------|-----------------------------------------------------------------------------|------------------------------------------------------|
| RemoteControlledCar | String carName   | String chooseCarRemoteControl(String remoteControlType) | When I run the method I should be able to decide the type of remote control | Returns a String stating the new remote control type |
|                     | String carModel  |                                                         |                                                                             |                                                      |


4. I want to be able to see the battery percentage remaining.


| Class                      | Member variables | Methods                                             | Scenario                                                                   | Output/Result                               |
|----------------------------|------------------|-----------------------------------------------------|----------------------------------------------------------------------------|---------------------------------------------|
| RemoteControlledCarBattery |                  | String showBatteryPercentage(int batteryPercentage) | When I run the method I should be able to get remaining battery percentage | Returns a String stating battery percentage |
|                            |                  |                                                     |                                                                            |                                             |


5. I want to be able to move the car forward and backward a specific distance.


| Class               | Member variables | Methods                                                   | Scenario                                                       | Output/Result                                                     |
|---------------------|------------------|-----------------------------------------------------------|----------------------------------------------------------------|-------------------------------------------------------------------|
| RemoteControlledCar | String carName   | String moveCarBackOrForth(int distance, String direction) | I want to move the car forward or backward a specific distance | Returns a String stating the distance and direction the car moved |
|                     | String carModel  |                                                           |                                                                |                                                                   |


6. I want to be able to stop the car from moving.


| Class               | Member variables | Methods          | Scenario                           | Output/Result                                           |
|---------------------|------------------|------------------|------------------------------------|---------------------------------------------------------|
| RemoteControlledCar | String carName   | String stopCar() | I want to stop the car from moving | Returns a String stating the the car has stopped moving |
|                     | String carModel  |                  |                                    |                                                         |


7. I want to be able to turn the car left and right.


| Class               | Member variables | Methods                                     | Scenario                             | Output/Result                                        |
|---------------------|------------------|---------------------------------------------|--------------------------------------|------------------------------------------------------|
| RemoteControlledCar | String carName   | String moveCarLeftOrRight(String direction) | I want to move the car left or right | Returns a String stating the direction the car moved |
|                     | String carModel  |                                             |                                      |                                                      |


9. I want to be able to replace the battery with either kind as needed.


| Class                      | Member variables | Methods                                      | Scenario                                                                  | Output/Result                                 |
|----------------------------|------------------|----------------------------------------------|---------------------------------------------------------------------------|-----------------------------------------------|
| RemoteControlledCarBattery |                  | String replaceCarBattery(String batteryType) | When I run the method I should be able to replace the type of car battery | Returns a String stating the new battery type |
|                            |                  |                                              |                                                                           |                                               |
