package me.duncte123;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws AWTException {
        final Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);

        robot.delay(1000); // aka Thread.sleep :P

        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);
    }
}