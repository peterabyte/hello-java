package com.peterabyte.hello.lang.java14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RecordTest {
    @Test
    public void givenRecordHasGetters() {
        User user = new User(1, "User Name");

        assertThat(user.id()).isEqualTo(1);
        assertThat(user.name()).isEqualTo("User Name");
    }

    @Test
    public void givenRecordHasEquals() {
        User userA = new User(1, "User A");
        User userSameAsA = new User(1, "User A");
        User userB = new User(2, "User B");

        assertThat(userA).isEqualTo(userSameAsA);
        assertThat(userA).isNotEqualTo(userB);
    }

    @Test
    public void givenRecordHasToString() {
        User user = new User(1, "User Name");

        assertThat(user.toString()).isEqualTo("User[id=1, name=User Name]");
    }
}
