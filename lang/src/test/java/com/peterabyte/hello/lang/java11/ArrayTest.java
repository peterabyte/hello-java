package com.peterabyte.hello.lang.java11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    @Test
    public void givenCollectionShouldConvertToArray() {
        var list = Arrays.asList("Hello", "Java", "11");

        String[] array = list.toArray(String[]::new);

        assertThat(array).containsExactly("Hello", "Java", "11");
    }
}
