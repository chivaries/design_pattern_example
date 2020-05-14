package com.glamrock.design_pattern.decorator.before;

public class SandwichWithPickle extends Sandwich {
    public void make() {
        super.make();
        addPickle();
    }

    private void addPickle() {
        System.out.println(" + 피클");
    }
}
