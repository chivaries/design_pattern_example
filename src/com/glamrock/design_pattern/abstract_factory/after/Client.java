package com.glamrock.design_pattern.abstract_factory.after;

public class Client {
    public static void main(String[] args) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("LG");
    }
}
