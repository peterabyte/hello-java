package com.peterabyte.hello.lang.java12;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void givenStringShouldIndent() {
        var str = "Hello\nJava 11!";

        var indented = str.indent(4);

        assertThat(indented).isEqualTo("    Hello\n    Java 11!\n");

        indented = indented.indent(-2);

        assertThat(indented).isEqualTo("  Hello\n  Java 11!\n");

        indented = indented.indent(-100);

        assertThat(indented).isEqualTo("Hello\nJava 11!\n");
    }

    @Test
    public void givenStringShouldTransform() {
        var str = "Hello Java 11!";

        var transformed = str.transform(String::toUpperCase);

        assertThat(transformed).isEqualTo("HELLO JAVA 11!");
    }
}
