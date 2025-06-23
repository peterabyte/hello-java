package com.peterabyte.hello.jmh;

import java.util.ArrayList;
import java.util.List;

public class ContainerList implements Container {
    private final List<Integer> elements = new ArrayList<>();

    public ContainerList() {}

    @Override
    public int add(int element) {
        elements.add(element);
        return element;
    }

    @Override
    public boolean contains(int element) {
        return elements.contains(element);
    }
}
