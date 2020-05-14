package com.glamrock.design_pattern.decorator.after;

public class Client {
    public static void main(String[] args) {
        Sandwich sandwichWithLecttuce = new LecttuceDecorator(new Bread());
        sandwichWithLecttuce.make();

        System.out.println("-------------------------");

        Sandwich sandwichWithLecttuceAndPickle = new PickleDecorator(new LecttuceDecorator(new Bread()));
        sandwichWithLecttuceAndPickle.make();
    }
}
