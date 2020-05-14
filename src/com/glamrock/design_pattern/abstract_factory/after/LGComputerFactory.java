package com.glamrock.design_pattern.abstract_factory.after;

public class LGComputerFactory implements ComputeFactory {
    @Override
    public LGKeyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public LGMouse createMouse() {
        return new LGMouse();
    }
}
