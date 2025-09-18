package com.peterabyte.hello.lang.java14;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class InstanceofTest {
    @Test
    public void givenInstanceof() {
        Object obj = new String("Hello Java 11!");
        if (obj instanceof String str) {
            assertThat(str).isEqualTo("Hello Java 11!");
        } else {
            fail();
        }
    }
}
