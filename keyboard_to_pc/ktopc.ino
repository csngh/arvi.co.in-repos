int data;

void setup() {
  Serial.begin(9600);
}

void loop() {
  if (Serial.available()) {
    data = Serial.read();
    Serial.println(data);
    data = 0;
  }else{
    Serial.println("Serial Communication not Available...");
  }

  delay(100);
}
