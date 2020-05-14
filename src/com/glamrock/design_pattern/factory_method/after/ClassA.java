package com.glamrock.design_pattern.factory_method.after;

public class ClassA {
    public Type createType(String type) {
        TypeFactory factory = new TypeFactory();
        Type returnType = factory.createType(type);

        return returnType;
    }
}
