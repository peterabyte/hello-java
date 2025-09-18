package com.peterabyte.hello.lang.java16;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class StreamTest {
    @Test
    public void givenStreamToList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> evensViaCollectors = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> evensViaToList = numbers.stream().filter(n -> n % 2 == 0).toList();

        assertThat(evensViaToList).containsExactlyElementsOf(evensViaCollectors);
    }
}
