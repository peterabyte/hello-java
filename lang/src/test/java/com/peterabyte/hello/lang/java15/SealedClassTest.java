package com.peterabyte.hello.lang.java15;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class SealedClassTest {
    @Test
    public void givenSealedClass() {
        Box box = new Present("Me", "U");

        if (box instanceof Present present) {
            assertThat(present.label()).isEqualTo("From: Me -> To: U");
        } else if (box instanceof Package) {
            fail();
        }
    }
}
