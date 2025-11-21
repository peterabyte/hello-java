package com.peterabyte.hello.lang.java25;

public abstract class Polygon {
    private final int numOfCorners;

    public Polygon(int numOfCorners) {
        this.numOfCorners = numOfCorners;
    }

    public int getNumOfCorners() {
        return this.numOfCorners;
    }
}
