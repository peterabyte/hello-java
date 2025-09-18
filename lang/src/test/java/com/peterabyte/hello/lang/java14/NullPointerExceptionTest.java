package com.peterabyte.hello.lang.java14;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class NullPointerExceptionTest {
    @Test
    public void givenNullPointerExceptionShouldShowExactly() {
        String str = null;

        assertThatThrownBy(() -> {str.isEmpty();})
            .isInstanceOf(NullPointerException.class)
            .hasMessageContaining("Cannot invoke \"String.isEmpty()\" because \"str\" is null");
    }
}
