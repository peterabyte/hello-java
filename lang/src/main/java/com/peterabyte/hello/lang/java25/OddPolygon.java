package com.peterabyte.hello.lang.java25;

public class OddPolygon extends Polygon {
    public OddPolygon(int numOfCorners) {
        if (numOfCorners % 2 != 0) {
            throw new IllegalArgumentException("Num of corners should be odd! provided: " + numOfCorners);
        }
        super(numOfCorners);
    }
}
