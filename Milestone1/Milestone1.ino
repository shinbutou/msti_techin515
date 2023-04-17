// Modified from the example (GestureSensor) of the Arduino_APDS9960 library

#include <Arduino_APDS9960.h>

void setup() {
  Serial.begin(9600);
  while (!Serial);

  if (!APDS.begin()) {
    Serial.println("Failed to initialize APDS-9960!");
  }

  //APDS.setGestureSensitivity(80);
  Serial.println("Detecting gestures...");
}

void loop() {
  if (APDS.gestureAvailable()) {
    // a gesture was detected, read and print to Serial Monitor
    int gesture = APDS.readGesture();

    switch (gesture) {
      case GESTURE_UP:
        Serial.println("Locked!");
        break;

      case GESTURE_DOWN:
        Serial.println("Unlocked");
        break;

      case GESTURE_LEFT:
        Serial.println("Vibration On/Off!");
        break;

      case GESTURE_RIGHT:
        Serial.println("LED On/Off!");
        break;

      default:
        // ignore
        break;
    }
  }
}
