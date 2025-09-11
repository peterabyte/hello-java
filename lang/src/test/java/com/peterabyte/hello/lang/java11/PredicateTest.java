package com.peterabyte.hello.lang.java11;

import static org.assertj.core.api.Assertions.assertThat;
import static java.util.function.Predicate.not;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class PredicateTest {
    @Test
    public void givenNotPredicateShouldNegate() {
        var strings = Arrays.asList("Hello", "", "Java", "", "11", "", "!");

        var filteredStrings = strings.stream().filter(str -> ! str.isBlank()).toList();
        var filteredStringWithPredicate = strings.stream().filter(not(String::isBlank)).toList();

        assertThat(filteredStrings).containsExactlyElementsOf(filteredStringWithPredicate);
    }
}
