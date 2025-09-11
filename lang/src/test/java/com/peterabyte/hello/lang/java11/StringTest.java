package com.peterabyte.hello.lang.java11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void givenEmptyStringIsBlank() {
        var str = "";

        assertThat(str.isBlank()).isTrue();
    }

    @Test
    public void givenMultilineStringShouldSplitIntoSeparateStrings() {
        var multilineString = "Hello\n \nJava 11";

        var lines = multilineString.lines().toList();

        assertThat(lines).containsExactly("Hello", " ", "Java 11");
    }

    @Test
    public void givenShouldRepeat() {
        var str = " Hello Java 11!  ";

        var strippedStr = str.strip();

        assertThat(strippedStr).isEqualTo("Hello Java 11!");
    }
}
