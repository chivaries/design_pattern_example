package com.glamrock.design_pattern.decorator.after;

public class PickleDecorator extends ToppingDecorator {
    public PickleDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void make() {
        super.make();
        addPickle();
    }

    private void addPickle() {
        System.out.println(" + 피클");
    }
}
