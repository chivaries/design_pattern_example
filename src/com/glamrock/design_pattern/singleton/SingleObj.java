package com.glamrock.design_pattern.singleton;

public class SingleObj {
    private static SingleObj singleObj = null;

    private SingleObj(){};

    public static SingleObj getInstance() {
        if (singleObj == null) {
            singleObj = new SingleObj();
        }

        return singleObj;
    }
}
