package me.duncte123;

import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CustomPresser implements IPresser {
    private final TreeSet<Integer> keycodes;

    public CustomPresser(String[] keys) {
        this.keycodes = Arrays.stream(keys)
                .map(this::getKeycode)
                .filter((k) -> k != KeyEvent.VK_UNDEFINED)
//                .map(KeyEvent::getKeyText)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    @Override
    public TreeSet<Integer> getKeys() {
        return this.keycodes;
    }

    private int getKeycode(String sUnparsed) {
        final String str = sUnparsed.toLowerCase();

        if (str.length() == 1) {
            return KeyEvent.getExtendedKeyCodeForChar(str.charAt(0));
        }

        switch (str) {
            case "alt":
                return KeyEvent.VK_ALT;
            case "shift":
                return KeyEvent.VK_SHIFT;
            case "ctrl":
            case "control":
                return KeyEvent.VK_CONTROL;
            case "enter":
                return KeyEvent.VK_ENTER;
            case "f1":
                return KeyEvent.VK_F1;
            case "f2":
                return KeyEvent.VK_F2;
            case "f3":
                return KeyEvent.VK_F3;
            case "f4":
                return KeyEvent.VK_F4;
            case "f5":
                return KeyEvent.VK_F5;
            case "f6":
                return KeyEvent.VK_F6;
            case "f7":
                return KeyEvent.VK_F7;
            case "f8":
                return KeyEvent.VK_F8;
            case "f9":
                return KeyEvent.VK_F9;
            case "f10":
                return KeyEvent.VK_F10;
            case "f11":
                return KeyEvent.VK_F11;
            case "f12":
                return KeyEvent.VK_F12;
            case "f13":
                return KeyEvent.VK_F13;
            case "f14":
                return KeyEvent.VK_F14;
            case "f15":
                return KeyEvent.VK_F15;
            case "f16":
                return KeyEvent.VK_F16;
            case "f17":
                return KeyEvent.VK_F17;
            case "f18":
                return KeyEvent.VK_F18;
            case "f19":
                return KeyEvent.VK_F19;
            case "f20":
                return KeyEvent.VK_F20;
            case "f21":
                return KeyEvent.VK_F21;
            case "f22":
                return KeyEvent.VK_F22;
            case "f23":
                return KeyEvent.VK_F23;
            case "f24":
                return KeyEvent.VK_F24;
            default:
                return KeyEvent.VK_UNDEFINED;
        }
    }
}
