package com.glamrock.design_pattern.command.after;

public class LampOnCommand implements Command {
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void run() {
        lamp.turnOn();
    }
}
