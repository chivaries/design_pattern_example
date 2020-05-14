package com.glamrock.design_pattern.command.after;

public class OKGoogle {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void talk() {
        command.run();
    }
}
