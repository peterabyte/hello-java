package com.peterabyte.hello.lang.java21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PatternMatchingSwitchTest {
    @Test
    public void givenPatternMatchingSwitchWithRecord() {
        Something thing = new ThisThing("item");

        String result;
        switch (thing) {
            case null -> throw new IllegalStateException("Null is not a thing!");
            case ThisThing ti -> result = ti.getName();
            case ThatThing ta -> result = ta.getUuid().toString();
            default -> result = "Who knows what this is...";
        }

        assertThat(result).isEqualTo("item");
    }
}
