package com.glamrock.design_pattern.decorator.before;

public class SandwichWithLettuce extends Sandwich {
    public void make() {
        super.make();
        addLectuce();
    }

    private void addLectuce() {
        System.out.println(" + 양상추");
    }

}
