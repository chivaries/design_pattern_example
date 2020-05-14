package com.glamrock.design_pattern.decorator.after;

public class Bread extends Sandwich {
    @Override
    public void make() {
        System.out.println("빵추가");
    }
}
