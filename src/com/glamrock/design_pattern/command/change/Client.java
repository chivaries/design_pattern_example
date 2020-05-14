package com.glamrock.design_pattern.command.change;

public class Client {
    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();
        OKGoogle okGoogle = new OKGoogle(heater, lamp);

        okGoogle.setMode(0);
        okGoogle.talk();

        okGoogle.setMode(1);
        okGoogle.talk();
    }
}
