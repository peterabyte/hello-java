package com.peterabyte.hello.lang.java12;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.time.DayOfWeek;

import org.junit.jupiter.api.Test;

public class SwitchExpressionTest {
    @Test
    public void givenSwitchExpressionShouldReturnValue() {
        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;

        var shouldWork = switch(dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
            case SATURDAY, SUNDAY -> false;
        };

        assertThat(shouldWork).isFalse();
    }

    @Test
    public void givenSwitchExpressionShouldCallWithoutReturn() {
        Worker worker = mock(Worker.class);

        DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;

        switch(dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> worker.work();
            case SATURDAY, SUNDAY -> worker.skip();
        };

        verify(worker).skip();
        verify(worker, never()).work();
    }
}
