void setup(){
  pinMode(4, INPUT);
  Serial.begin(9600);
}
void loop(){
  int a = digitalRead(4);
  Serial.println(a);
}
