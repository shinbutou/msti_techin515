void setup() {
  pinMode(9, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(7, OUTPUT);
}

void loop() {
  digitalWrite(9, HIGH);
  delay(1000);
  digitalWrite(9, LOW);
  digitalWrite(8, HIGH);
  delay(1000);
  digitalWrite(8, LOW);
  digitalWrite(7, HIGH);
  delay(1000);
  digitalWrite(7, LOW);
}
