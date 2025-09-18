package com.peterabyte.hello.lang.java15;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class RecordTest {
    @Test
    public void givenRecordShouldThrowExceptionIfInvalid() {
        assertThatThrownBy(() -> new Person("Invalid Person", -1))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void givenRecordShouldNotThrowExceptionIfValid() {
        Person person = new Person("Valid Person", 1);

        assertThat(person.name()).isEqualTo("Valid Person");
        assertThat(person.age()).isEqualTo(1);
    }
}
