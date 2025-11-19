package com.peterabyte.hello.lang.java21;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VirtualThreadTest {
    @Test
    public void givenVirtualThreads() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> {
                latch.countDown();
            });
            executor.awaitTermination(1, TimeUnit.SECONDS);
        }

        assertThat(latch.getCount()).isEqualTo(0);
    }
}
