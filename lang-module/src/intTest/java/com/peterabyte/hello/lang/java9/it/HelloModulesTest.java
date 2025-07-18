package com.peterabyte.hello.lang.java9.it;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

import org.junit.jupiter.api.Test;

import com.peterabyte.hello.lang.java9.module.HelloModulesService;

public class HelloModulesTest {
    @Test
    public void shouldSayHello() {
        Iterable<HelloModulesService> serviceFinder = ServiceLoader.load(HelloModulesService.class);
        HelloModulesService service = StreamSupport.stream(serviceFinder.spliterator(), false)
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("Failed to create HelloModulesService!"));
        
        String hello = service.sayHello();

        assertEquals("Hello Modules!", hello);
    }
}
