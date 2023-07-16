1. `Car`:
   - Attributes:
     - `color`: String
     - `battery`: Battery
     - `remoteControl`: RemoteControl
     - `direction`: String
   - Methods:
     - `moveForward(distance: int): void`
     - `moveBackward(distance: int): void`
     - `stopMoving(): void`
     - `turn(direction: String): void`
     - `replaceBattery(battery: Battery): void`
2. `Battery`:
   - Attributes:
     - `type`: String (rechargeable, disposable)
     - `percentage`: int
   - Methods:
     - `getRemainingPercentage(): int`
3. `RemoteControl`:
   - Attributes:
     - `type`: String (simple, advanced)