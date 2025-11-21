package com.peterabyte.hello.lang.java25;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FlexibleConstructorTest {
    @Test
    public void givenOddPolygonShouldNotThrowException() {
        assertDoesNotThrow(() -> {
            Polygon _ = new OddPolygon(4);
        });
    }

    @Test
    public void givenInvalidOddPolygonShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Polygon _ = new OddPolygon(5);
        });
    }
}
