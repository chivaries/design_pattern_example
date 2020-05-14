package com.glamrock.design_pattern.abstract_factory.after;

public class FactoryOfComputerFactory {
    public void createComputer(String type) {
        ComputeFactory computeFactory = null;

        switch(type) {
            case "LG":
                computeFactory = new LGComputerFactory();
                break;

            case "Samsung":
                computeFactory = new SamsungComputerFactory();
                break;
        }

        computeFactory.createKeyboard();
        computeFactory.createMouse();
    }
}
