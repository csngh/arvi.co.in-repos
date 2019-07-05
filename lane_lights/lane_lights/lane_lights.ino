int dataFromBT;
const int led1 = 2;
const int led2 = 3;
const int led3 = 4;
const int led4 = 5;
const int led5 = 6;
const int led6 = 7;
const int led7 = 8;
const int led8 = 9;
const int led9 = 10;

void setup() {
  Serial.begin(9600);
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  pinMode(led4, OUTPUT);
  pinMode(led5, OUTPUT);
  pinMode(led6, OUTPUT);
  pinMode(led7, OUTPUT);
  pinMode(led8, OUTPUT);
  pinMode(led9, OUTPUT);
}

void loop() {
  if (Serial.available())

    dataFromBT = Serial.read();

  if (dataFromBT == 48)
  {
    Serial.println(dataFromBT);
    digitalWrite(led1, HIGH);
  }
  else if (dataFromBT == 49)
  {
    Serial.println(dataFromBT);
    digitalWrite(led1, LOW);
  }
  else if (dataFromBT == 50)
  {
    Serial.println(dataFromBT);
    digitalWrite(led2, HIGH);
  }
  else if (dataFromBT == 51)
  {
    Serial.println(dataFromBT);
    digitalWrite(led2, LOW);
  }
  if (dataFromBT == 52)
  {
    Serial.println(dataFromBT);
    digitalWrite(led3, HIGH);
  }
  else if (dataFromBT == 53)
  {
    Serial.println(dataFromBT);
    digitalWrite(led3, LOW);
  }
  if (dataFromBT == 54)
  {
    Serial.println(dataFromBT);
    digitalWrite(led4, HIGH);
  }
  else if (dataFromBT == 55)
  {
    Serial.println(dataFromBT);
    digitalWrite(led4, LOW);
  }
  if (dataFromBT == 56)
  {
    Serial.println(dataFromBT);
    digitalWrite(led5, HIGH);
  }
  else if (dataFromBT == 57)
  {
    Serial.println(dataFromBT);
    digitalWrite(led5, LOW);
  }
  if (dataFromBT == 97)
  {
    Serial.println(dataFromBT);
    digitalWrite(led6, HIGH);
  }
  else if (dataFromBT == 98)
  {
    Serial.println(dataFromBT);
    digitalWrite(led6, LOW);
  }
  if (dataFromBT == 99)
  {
    Serial.println(dataFromBT);
    digitalWrite(led7, HIGH);
  }
  else if (dataFromBT == 100)
  {
    Serial.println(dataFromBT);
    digitalWrite(led7, LOW);
  }
  if (dataFromBT == 101)
  {
    Serial.println(dataFromBT);
    digitalWrite(led8, HIGH);
  }
  else if (dataFromBT == 102)
  {
    Serial.println(dataFromBT);
    digitalWrite(led8, LOW);
  }
  if (dataFromBT == 103)
  {
    Serial.println(dataFromBT);
    digitalWrite(led9, HIGH);
  }
  else if (dataFromBT == 104)
  {
    Serial.println(dataFromBT);
    digitalWrite(led9, LOW);
  }
}
