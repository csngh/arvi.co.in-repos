void setup()
{
  pinMode(13, OUTPUT);
}
void loop()
{ 
  int del = 700;
  for (int i = del; i >= 0; i--)
  {
     if (i > 400)
    {
       digitalWrite(13, HIGH);
       delay(del);
       digitalWrite(13, LOW);
       delay(del); 
       del = del / 1.25;
    }
    else
    {
       digitalWrite(13, HIGH);
       delay(del);
       digitalWrite(13, LOW);
       delay(del); 
       digitalWrite(13, HIGH);
       delay(del);
       digitalWrite(13, LOW);
       delay(del); 
       digitalWrite(13, HIGH);
       delay(del);
       digitalWrite(13, LOW);
       delay(del); 
       del = del / 1.25;
    }   
    while(del == 0)
    {
      digitalWrite(13, HIGH);
    }
  }
}

