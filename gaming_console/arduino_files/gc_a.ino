int data;

void setup() {
  Serial.begin(9600);
}

void loop() {
  if (Serial.available())

    data = Serial.read();

  if (data == 49) //Up
  {
    Serial.println(data);
    data = 0;
  }

  else if (data == 50) //Left
  {
    Serial.println(data);
    data = 0;
  }

  else if (data == 51) //Right
  {
    Serial.println(data);
    data = 0;
  }

  else if (data == 52) //Down
  {
    Serial.println(data);
    data = 0;
  }

  else if (data == 53) //bk
  {
    Serial.println(data);
    data = 0;
  }

  else if (data == 54) //sel
  {
    Serial.println(data);
    data = 0;
  }

}



