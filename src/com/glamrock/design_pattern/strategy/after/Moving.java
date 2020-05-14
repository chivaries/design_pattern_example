package com.glamrock.design_pattern.strategy.after;

public class Moving {
    private MovableStrategy movableStrategy;

    public void move() {
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }
}
