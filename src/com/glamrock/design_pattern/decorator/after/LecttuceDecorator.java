package com.glamrock.design_pattern.decorator.after;

public class LecttuceDecorator extends ToppingDecorator {
    public LecttuceDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public void make() {
        super.make();
        addLettuce();
    }

    private void addLettuce() {
        System.out.println(" + 양상추");
    }
}
