#include <SPI.h>

#include "RTClib.h"
RTC_DS1307 RTC;
void setup () {
  RTC.begin();
  delay(500);
  RTC.adjust(DateTime(__DATE__, __TIME__));
  delay(1000);
  Serial.begin(9600);
}
void loop() {
  DateTime now = RTC.now();

  Serial.print(now.day(), DEC);
  Serial.print('/');
  Serial.print(now.month(), DEC);
  Serial.print('/');
  Serial.print(now.year(), DEC);
  Serial.print(' ');
  Serial.print(now.hour(), DEC);
  Serial.print(':');
  Serial.print(now.minute(), DEC);
  Serial.print(':');
  Serial.print(now.second(), DEC);
  Serial.println();
  delay(1000);
}
