package com.glamrock.design_pattern.decorator.before;

public class SandwichWithLettuceAndPickle extends Sandwich {
    public void make(){
        super.make();
        addLettuce();
        addPickle();
    }

    private void addLettuce(){
        System.out.println(" + 양상추");
    }

    private void addPickle(){
        System.out.println(" + 피클");
    }
}
