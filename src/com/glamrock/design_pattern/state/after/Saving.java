package com.glamrock.design_pattern.state.after;

public class Saving implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("전원 on");
    }
}
