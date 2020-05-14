package com.glamrock.design_pattern.abstract_factory.before;

public class KeyboardFactory {
    public Keyboard createKeyboard(String type) {
        Keyboard keyboard = null;
        switch(type) {
            case "LG":
                keyboard = new LGKeyboard();
                break;
            case "Samsung":
                keyboard = new SamsungKeyboard();
                break;
        }

        return keyboard;
    }
}
