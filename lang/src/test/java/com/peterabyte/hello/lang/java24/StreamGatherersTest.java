package com.peterabyte.hello.lang.java24;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamGatherersTest {
    @Test
    public void givenIntStreamShouldFoldToSum() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        var sum = numbers.gather(Gatherers.fold(() -> 0, Integer::sum)).toList().getFirst();

        assertThat(sum).isEqualTo(15);
    }

    @Test
    public void givenLettersStreamShouldMapToUpperCase() {
        Stream<String> letters = Stream.of("a", "b", "c", "D", "e");

        int maxConcurrency = 2;
        List<String> upperCaseLetters = letters.gather(Gatherers.mapConcurrent(maxConcurrency, String::toUpperCase)).toList();

        assertThat(upperCaseLetters).containsExactlyInAnyOrder("A", "B", "C", "D", "E");
    }

    @Test
    public void givenIntStreamShouldScanToIncrementalSum() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        List<Integer> sums = numbers.gather(Gatherers.scan(() -> 0, Integer::sum)).toList();

        assertThat(sums).containsExactly(1, 3, 6, 10, 15);
    }

    @Test
    public void givenIntStreamShouldGatherIntoSlidingWindow() {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        List<List<Integer>> numWindows = numbers.gather(Gatherers.windowSliding(3)).toList();

        assertThat(numWindows).hasSize(3);
        assertThat(numWindows.get(0)).containsExactly(1, 2, 3);
        assertThat(numWindows.get(1)).containsExactly(2, 3, 4);
        assertThat(numWindows.get(2)).containsExactly(3, 4, 5);
    }
}
