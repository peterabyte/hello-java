package com.peterabyte.hello.jmh;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ContainerSetTest {
    ContainerSet container;

    @Before
    public void setup() {
        container = new ContainerSet();
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
