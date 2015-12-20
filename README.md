## FRC GearsBot with keypad mapping for Logitech F310 gamepad

This project is a modification of the standard FRCSim GearsBot with keypad mappings for the Logitech F310 gamepad. The details below describe how the various controls are mapped.

The button numbers below correspond to the `buttonNumber` parameter in the WPILib `JoystickButton` class constructor.

| Button Descritpion | Button Number |
|:-------------------|:--------------|
| LB                 | 5             |
| RB                 | 6             |
| Y                  | 4             |
| B                  | 2             |
| A                  | 1             |
| X                  | 3             |
| Left analog push   | 9             |
| Right analog push  | 10            |


The axis numbers below correspond to the `axis` parameter in the WPILib `Joystick` class member `getRawAxis()`


| Axis Description | Axis Number | Axis  Limix (min)  | Axis Limit (max) |
|:-----------------|:------------|:-------------------|:-----------------|
| Left X           | 0           | -1 (right)         | 1 (left)         |
| Left Y           | 1           | -1 (backward)      | 1 (forward)      |
| Right X          | 3           | -1 (right)         | 1 (left)         |
| Right Y          | 4           | -1 (backward)      | 1 (forward)      |
| LT button        | 2           | -1 (fully pressed) | 1 (not pressed)  |
| RT button        | 5           | -1 (fully pressed) | 1 (not pressed)  |
