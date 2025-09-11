package com.peterabyte.hello.lang.java9;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAutoCloseableTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAutoCloseableTest.class);

    @Test
    public void shouldClose() {
        MyAutoCloseable closeable = new MyAutoCloseable();
        try (closeable) {
            LOGGER.debug("Do something...");
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
        assertThat(closeable.isClosed()).isTrue();
    }
}
