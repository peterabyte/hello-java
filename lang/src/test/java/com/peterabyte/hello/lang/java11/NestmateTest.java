package com.peterabyte.hello.lang.java11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class NestmateTest {
    @Test
    public void givenNetsmatesShouldReturnTheSameNestHost() {
        var outerNestHost = Outer.class.getNestHost().getName();
        var innerNestHost = Outer.Inner.class.getNestHost().getName();

        assertThat(outerNestHost).isEqualTo(innerNestHost);
        assertThat(outerNestHost).isEqualTo("com.peterabyte.hello.lang.java11.Outer");
    }

    @Test
    public void givenNestmatesShuoldBeNestmates() {
        assertThat(Outer.Inner.class.isNestmateOf(Outer.class));
    }

    @Test
    public void givenNestmatesShouldBeNestMembers() {
        var nestMembers = Arrays.stream(Outer.Inner.class.getNestMembers())
            .map(Class::getName)
            .collect(Collectors.toSet());
        
        assertThat(nestMembers).containsExactly(
            "com.peterabyte.hello.lang.java11.Outer",
            "com.peterabyte.hello.lang.java11.Outer$Inner");
    }
}
