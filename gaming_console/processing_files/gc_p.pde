import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.event.KeyEvent; 
import processing.serial.*;

Serial myPort;  
Robot robot;

void setup() {
  printArray(Serial.list());
  myPort = new Serial(this, Serial.list()[1], 9600);
}

void draw() {
  while (myPort.available() > 0) {
    String inBuffer = myPort.readString();   
    if (inBuffer != null) 
    {
      try 
      {
        String tmp = trim(inBuffer);
        int value = Integer.parseInt(tmp);
        println(value);
        if (value == 1)
        {
          try { 
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_UP);
          } 
          catch (AWTException e) { 
            e.printStackTrace();
          }
        }
        else if (value == 2)
        {
          try { 
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_LEFT);
          } 
          catch (AWTException e) { 
            e.printStackTrace();
          }
        }
        else if (value == 3)
        {
          try { 
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_RIGHT);
          } 
          catch (AWTException e) { 
            e.printStackTrace();
          }
        }
        else if (value == 4)
        {
          try { 
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
          } 
          catch (AWTException e) { 
            e.printStackTrace();
          }
        }
        else if (value == 53)
        {
          try { 
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);
          } 
          catch (AWTException e) { 
            e.printStackTrace();
          }
        }
        else if (value == 54)
        {
          try { 
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
          } 
          catch (AWTException e) { 
            e.printStackTrace();
          }
        }
      }
      catch(Exception e)
      {
        println("Error");
      }
    }
  }
}