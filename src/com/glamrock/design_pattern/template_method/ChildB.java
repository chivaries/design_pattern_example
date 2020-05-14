package com.glamrock.design_pattern.template_method;

public class ChildB extends Parent {
    @Override
    public void hook() {
        System.out.println("Child B 에서 hook 구현");
    }
}
