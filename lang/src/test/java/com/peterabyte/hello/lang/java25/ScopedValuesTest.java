package com.peterabyte.hello.lang.java25;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScopedValuesTest {
    private final ScopedValue<String> USER = ScopedValue.newInstance();

    @Test
    public void givenScopedValue() throws Exception {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            ConcurrentMap<String, String> threadsPerUser = new ConcurrentHashMap<>();

            executor.submit(() -> ScopedValue.where(USER, "Bob").run(() -> {
                String user = USER.get();
                threadsPerUser.put(user, Thread.currentThread().toString());
            }));

            executor.submit(() -> ScopedValue.where(USER, "Joe").run(() -> {
                String user = USER.get();
                threadsPerUser.put(user, Thread.currentThread().toString());
            }));

            executor.awaitTermination(1, TimeUnit.SECONDS);

            assertThat(threadsPerUser.get("Bob")).isNotEqualTo(threadsPerUser.get("Joe"));
        }
    }
}
