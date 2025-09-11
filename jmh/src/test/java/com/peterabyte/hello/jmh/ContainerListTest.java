package com.peterabyte.hello.jmh;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainerListTest {
    ContainerList container;

    @BeforeEach
    public void setup() {
        container = new ContainerList();
    }

    @Test
    public void givenEmptyContainerShouldNotContainAnyElements() {
        assertFalse(container.contains(0));
    }

    @Test
    public void givenContainerShouldOnlyContainAddedElements() {
        container.add(1);
        container.add(3);
        container.add(6);

        assertFalse(container.contains(0));
        assertTrue(container.contains(1));
        assertFalse(container.contains(2));
        assertTrue(container.contains(3));
        assertTrue(container.contains(6));
    }
}
