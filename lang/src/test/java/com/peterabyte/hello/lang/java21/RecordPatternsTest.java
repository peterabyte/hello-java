package com.peterabyte.hello.lang.java21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordPatternsTest {
    @Test
    public void givenBeforeRecordPattern() {
        Object obj = new Point(1, 1);

        var sum = 0;
        if (obj instanceof Point p) {
            sum = p.x() + p.y();
        }

        assertThat(sum).isEqualTo(2);
    }

    @Test
    public void givenWithPatternMatch() {
        Object obj = new Point(1, 1);

        var sum = 0;
        if (obj instanceof Point(int x, int y)) {
            sum = x + y;
        }

        assertThat(sum).isEqualTo(2);
    }
}
