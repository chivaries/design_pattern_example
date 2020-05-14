package com.glamrock.design_pattern.state.after;

public class On implements PowerState {
    @Override
    public void powerPush() {
        System.out.println("절전 모드");
    }
}
