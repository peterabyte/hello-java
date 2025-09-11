package com.peterabyte.hello.lang.java12;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TeeingCollectorTest {
    @Test
    public void givenNumberShouldCalculateAverage() {
        var avg = Stream.of(1, 2, 3, 4, 5)
            .collect(Collectors.teeing(
                Collectors.summingDouble(num -> num),
                Collectors.counting(),
                (sum, count) -> sum / count
            ));
        
        assertThat(avg).isEqualTo(3);
    }
}
