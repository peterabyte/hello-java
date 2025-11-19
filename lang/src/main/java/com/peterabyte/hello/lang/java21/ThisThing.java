package com.peterabyte.hello.lang.java21;

public class ThisThing implements Something {
    private final String name;

    public ThisThing(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
