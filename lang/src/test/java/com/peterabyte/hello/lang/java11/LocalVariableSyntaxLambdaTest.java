package com.peterabyte.hello.lang.java11;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import jakarta.annotation.Nonnull;

public class LocalVariableSyntaxLambdaTest {
    @Test
    public void givenLambdaWithLocalVarShouldBeAbleToAnnotate() {
        var strings = Arrays.asList("Hello", "Java", "11");

        var result = strings.stream()
            .map((@Nonnull var str) -> str.toUpperCase())
            .toList();
        
        assertThat(result).containsExactly("HELLO", "JAVA", "11");
    }
}
