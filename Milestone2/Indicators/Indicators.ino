#include <Adafruit_NeoPixel.h>
#ifdef __AVR__
#include <avr/power.h>
#endif

#define PIN_NEO_PIXEL  0
#define NUM_PIXELS     1

Adafruit_NeoPixel NeoPixel(NUM_PIXELS, PIN_NEO_PIXEL, NEO_GRB + NEO_KHZ800);

void setup() {
  Serial.begin(9600);
  NeoPixel.begin();
}

void loop() {
  NeoPixel.setPixelColor(0, NeoPixel.Color(255, 255, 255)); // WHITE
  NeoPixel.show();
  delay(2000);
  NeoPixel.setPixelColor(0, NeoPixel.Color(0, 0, 255)); // BLUE
  NeoPixel.show();
  delay(2000);
  NeoPixel.setPixelColor(0, NeoPixel.Color(255, 255, 50)); // YELLOW
  NeoPixel.show();
  delay(2000);
  NeoPixel.setPixelColor(0, NeoPixel.Color(255, 0, 0)); // RED
  NeoPixel.show();
  delay(2000);
  NeoPixel.setPixelColor(0, NeoPixel.Color(0, 255, 0)); // GREEN
  NeoPixel.show();
  delay(2000);
  NeoPixel.setPixelColor(0, NeoPixel.Color(255, 0, 255)); // PURPLE
  NeoPixel.show();
  delay(2000);
}