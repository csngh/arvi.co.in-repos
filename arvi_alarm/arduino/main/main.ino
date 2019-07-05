int dataFromBT;

void setup() {
  Serial.begin(9600);
}

void loop() {
  if (Serial.available()) {
    dataFromBT = Serial.read() - '0';
    Serial.println(dataFromBT);
  }
  delay(200);
}





