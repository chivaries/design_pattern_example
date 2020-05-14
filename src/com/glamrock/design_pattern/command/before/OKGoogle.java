package com.glamrock.design_pattern.command.before;

public class OKGoogle {
    private Heater heater;

    public OKGoogle(Heater heater) {
        this.heater = heater;
    }

    public void talk() {
        heater.powerOn();
    }
}
