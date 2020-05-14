package com.glamrock.design_pattern.strategy.before;

public class Client {
    public static void main(String[] args) {
        Movable train = new Train();
        Movable bus = new Bus();

        train.move();
        bus.move();
    }
}
