package me.duncte123;

import java.awt.*;
import java.util.TreeSet;

public interface IPresser {
    default void pressKeys(int holdMs) throws AWTException {
        final Robot robot = new Robot();

        final TreeSet<Integer> keys = getKeys();

        for (int key : keys) {
            robot.keyPress(key);
        }

        robot.delay(holdMs); // aka Thread.sleep :P

        for (int key : keys) {
            robot.keyRelease(key);
        }
    }

    TreeSet<Integer> getKeys();
}
