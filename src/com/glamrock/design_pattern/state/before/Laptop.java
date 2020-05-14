package com.glamrock.design_pattern.state.before;

public class Laptop {
    public static String ON = "on";
    public static String OFF = "off";
    private String powerState = "";

    public Laptop() {
        setPowerState(Laptop.OFF);
    }

    public void setPowerState(String powerState) {
        this.powerState = powerState;
    }

    public void powerPush() {
        if("on".equals(this.powerState)) {
            System.out.println("전원 Off");
        } else {
            System.out.println("전원 On");
        }
    }
}
