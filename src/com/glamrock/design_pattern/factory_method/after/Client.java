package com.glamrock.design_pattern.factory_method.after;

public class Client {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.createType("A");
        classA.createType("B");
    }
}
