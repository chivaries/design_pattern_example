package com.glamrock.design_pattern.command.before;

public class Client {
    public static void main(String[] args) {
        Heater heater = new Heater();
        OKGoogle okGoogle = new OKGoogle(heater);
        okGoogle.talk();
    }
}
