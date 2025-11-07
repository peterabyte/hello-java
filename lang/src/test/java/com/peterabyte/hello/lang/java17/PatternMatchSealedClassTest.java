package com.peterabyte.hello.lang.java17;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PatternMatchSealedClassTest {
    @Test
    public void givenSealedClassShouldPatternMatch() {
        Item item = new Gadget();

        var name = switch (item) {
            case Device d -> d.getName();
            case Gadget g -> g.getName();
            default -> "na";
        };

        assertThat(name).isEqualTo("gadget");
    }
}
