1. `Car`:
   - Attributes:
     - `color`: String
     - `battery`: Battery
     - `remoteControl`: RemoteControl
     - `direction`: String
   - Methods:
     - `moveForward(distance: float): void`
     - `moveBackward(distance: float): void`
     - `stop(): void`
     - `turn(direction: String): void`
     - `replaceBattery(battery: Battery): void`
2. `Battery`:
   - Attributes:
     - `type`: String (rechargeable, disposable)
     - `percentage`: float
   - Methods:
     - `getPercentage(): float`
3. `RemoteControl`:
   - Attributes:
     - `type`: String (simple, advanced)
   - Methods:
     - `forward(distance: float): void`
     - `backward(distance: float): void`
     - `stop(): void`
     - `turn(direction: String): void`