import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.Toolkit;
import java.awt.event.KeyEvent; 
import processing.serial.*;

Serial myPort;
        Robot robot;

        void setup () {
            printArray(Serial.list());
            myPort = new Serial(this, "COM37", 9600);
        }

        void draw () {
            while (myPort.available() > 0) {
                String inBuffer = myPort.readString();
                if (inBuffer != null) {
                    try {
                        String tmp = trim(inBuffer);
                        int value = Integer.parseInt(tmp);
                        println(value);

                        switch (value) {
                            case 123:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_UP);
                                    robot.keyRelease(KeyEvent.VK_UP);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 124:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_LEFT);
                                    robot.keyRelease(KeyEvent.VK_LEFT);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 125:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_RIGHT);
                                    robot.keyRelease(KeyEvent.VK_RIGHT);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 126:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_DOWN);
                                    robot.keyRelease(KeyEvent.VK_DOWN);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 48:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_0);
                                    robot.keyRelease(KeyEvent.VK_0);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 49:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_1);
                                    robot.keyRelease(KeyEvent.VK_1);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 50:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_2);
                                    robot.keyRelease(KeyEvent.VK_2);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 51:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_3);
                                    robot.keyRelease(KeyEvent.VK_3);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 52:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_4);
                                    robot.keyRelease(KeyEvent.VK_4);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 53:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_5);
                                    robot.keyRelease(KeyEvent.VK_5);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 54:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_6);
                                    robot.keyRelease(KeyEvent.VK_6);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 55:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_7);
                                    robot.keyRelease(KeyEvent.VK_7);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 56:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_8);
                                    robot.keyRelease(KeyEvent.VK_8);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 57:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_9);
                                    robot.keyRelease(KeyEvent.VK_9);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 97:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_A);
                                    robot.keyRelease(KeyEvent.VK_A);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 98:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_B);
                                    robot.keyRelease(KeyEvent.VK_B);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 99:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_C);
                                    robot.keyRelease(KeyEvent.VK_C);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 100:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_D);
                                    robot.keyRelease(KeyEvent.VK_D);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 101:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_E);
                                    robot.keyRelease(KeyEvent.VK_E);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 102:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_F);
                                    robot.keyRelease(KeyEvent.VK_F);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 103:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_G);
                                    robot.keyRelease(KeyEvent.VK_G);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 104:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_H);
                                    robot.keyRelease(KeyEvent.VK_H);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 105:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_I);
                                    robot.keyRelease(KeyEvent.VK_I);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 106:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_J);
                                    robot.keyRelease(KeyEvent.VK_J);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 107:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_K);
                                    robot.keyRelease(KeyEvent.VK_K);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 108:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_L);
                                    robot.keyRelease(KeyEvent.VK_L);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 109:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_M);
                                    robot.keyRelease(KeyEvent.VK_M);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 110:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_N);
                                    robot.keyRelease(KeyEvent.VK_N);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 111:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_O);
                                    robot.keyRelease(KeyEvent.VK_O);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 112:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_P);
                                    robot.keyRelease(KeyEvent.VK_P);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 113:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_Q);
                                    robot.keyRelease(KeyEvent.VK_Q);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 114:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_R);
                                    robot.keyRelease(KeyEvent.VK_R);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 115:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_S);
                                    robot.keyRelease(KeyEvent.VK_S);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 116:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_T);
                                    robot.keyRelease(KeyEvent.VK_T);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 117:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_U);
                                    robot.keyRelease(KeyEvent.VK_U);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 118:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_V);
                                    robot.keyRelease(KeyEvent.VK_V);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 119:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_W);
                                    robot.keyRelease(KeyEvent.VK_W);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 120:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_X);
                                    robot.keyRelease(KeyEvent.VK_X);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 121:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_Y);
                                    robot.keyRelease(KeyEvent.VK_Y);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 122:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_Z);
                                    robot.keyRelease(KeyEvent.VK_Z);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 33:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_F1);
                                    robot.keyRelease(KeyEvent.VK_F1);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 34:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_F2);
                                    robot.keyRelease(KeyEvent.VK_F2);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 35:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_F4);
                                    robot.keyRelease(KeyEvent.VK_F4);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 37:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_F5);
                                    robot.keyRelease(KeyEvent.VK_F5);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 38:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_SPACE);
                                    robot.keyRelease(KeyEvent.VK_SPACE);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 39:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_BACK_SPACE);
                                    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 68:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_LESS);
                                    robot.keyRelease(KeyEvent.VK_LESS);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 69:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_GREATER);
                                    robot.keyRelease(KeyEvent.VK_GREATER);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 42:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_ALT);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 43:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_ESCAPE);
                                    robot.keyRelease(KeyEvent.VK_ESCAPE);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 44:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_PRINTSCREEN);
                                    robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 45:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_PAGE_UP);
                                    robot.keyRelease(KeyEvent.VK_PAGE_UP);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 46:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                                    robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 47:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_DELETE);
                                    robot.keyRelease(KeyEvent.VK_DELETE);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 91:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_TAB);
                                    robot.keyRelease(KeyEvent.VK_TAB);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 92:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_ADD);
                                    robot.keyRelease(KeyEvent.VK_ADD);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 93:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_MINUS);
                                    robot.keyRelease(KeyEvent.VK_MINUS);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 94:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_MULTIPLY);
                                    robot.keyRelease(KeyEvent.VK_MULTIPLY);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 67:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 96:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_EQUALS);
                                    robot.keyRelease(KeyEvent.VK_EQUALS);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 36:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_DIVIDE);
                                    robot.keyRelease(KeyEvent.VK_DIVIDE);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 58:
                                try {
                                    Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 59:
                                try {
                                    Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 60:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_SHIFT);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 61:
                                try {
                                    robot = new Robot();
                                    robot.keyRelease(KeyEvent.VK_SHIFT);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 62:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_CONTROL);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 63:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_ENTER);
                                    robot.keyRelease(KeyEvent.VK_ENTER);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 64: //Google Chrome
                                try{
                                    Process p = Runtime.getRuntime().exec("\"C:/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
                                    p.waitFor();
                                }catch(Exception e){
                                    e.printStackTrace()
                                }
                                break;
                            case 40: //Word
                                try{
                                    Process p = Runtime.getRuntime().exec("\"C:/Program Files (x86)/\"");
                                    p.waitFor();
                                }catch(Exception e){
                                    e.printStackTrace()
                                }
                                break;
                            case 95: //Excel
                                try{
                                    Process p = Runtime.getRuntime().exec("\"C:/Program Files (x86)/\"");
                                    p.waitFor();
                                }catch(Exception e){
                                    e.printStackTrace()
                                }
                                break;
                            case 65:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 66:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 71:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_SLASH);
                                    robot.keyRelease(KeyEvent.VK_SLASH);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 70:
                                try {
                                    robot = new Robot();
                                    robot.keyPress(KeyEvent.VK_BACK_SLASH);
                                    robot.keyRelease(KeyEvent.VK_BACK_SLASH);
                                } catch (AWTException e) {
                                    e.printStackTrace();
                                }
                                break;
                        }

                    } catch (Exception e) {
                        println("Error");
                    }
                }
            }
        }
