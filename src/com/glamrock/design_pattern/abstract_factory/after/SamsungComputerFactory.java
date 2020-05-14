package com.glamrock.design_pattern.abstract_factory.after;

public class SamsungComputerFactory implements ComputeFactory {
    @Override
    public SamsungKeyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public SamsungMouse createMouse() {
        return new SamsungMouse();
    }
}
