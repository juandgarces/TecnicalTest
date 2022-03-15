package co.com.pruebatecnica.utils;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
public class Robote {

    public static void moverMouse() throws AWTException {
        Robot robot = new Robot();
        robot.mouseWheel(150);
        String x = "";

    }

    public static void clicMouse(int x, int y) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }


}
