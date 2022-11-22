package me.duncte123;

import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.TreeSet;

public class AltF4Presser implements IPresser {
    @Override
    public TreeSet<Integer> getKeys() {
        return new TreeSet<>(Arrays.asList(
                KeyEvent.VK_ALT,
                KeyEvent.VK_F4
        ));
    }
}
