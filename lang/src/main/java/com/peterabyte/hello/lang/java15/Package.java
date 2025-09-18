package com.peterabyte.hello.lang.java15;

public non-sealed class Package extends Box {
    private final int weight;

    public Package(int weight) {
        this.weight = weight;
    }

    public int weight() {
        return weight;
    }
}
