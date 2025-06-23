package com.peterabyte.hello.jmh;

import java.util.HashSet;
import java.util.Set;

public class ContainerSet implements Container {
    private final Set<Integer> elements = new HashSet<>();

    public ContainerSet() {}

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
