package com.peterabyte.hello.lang.java17;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class PseudoRandomGeneratorTest {
    @Test
    public void shouldGeneratePseudoRandom() {
        int min = 0;
        int max = 100;
        int numOfRandoms = 10;
        IntStream randoms = RandomGeneratorFactory.getDefault()
            .create()
            .ints(numOfRandoms, min, max);
        
        assertThat(randoms).allMatch(n -> n >= min && n < max);
    }
}
