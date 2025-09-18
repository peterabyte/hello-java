package com.peterabyte.hello.lang.java13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SwitchExpressionTest {
    @Test
    public void givenSwitchExpressionShouldYieldResult() {
        var num = 4;
        var op = Operation.DOUBLE;
        
        var result = switch(op) {
            case DOUBLE -> {
                yield num * 2;
            }
            case SQUARE -> {
                yield num * num;
            }
        };

        assertThat(result).isEqualTo(8);
    }
}
