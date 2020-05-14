package com.glamrock.design_pattern.decorator.after;

public class ToppingDecorator extends Sandwich {
    private Sandwich sandwich;

    public ToppingDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public void make() {
        sandwich.make();
    }
}
