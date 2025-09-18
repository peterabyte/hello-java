package com.peterabyte.hello.lang.java16;

public interface HelloWorld {
    default String hello() {
        return "world";
    }
}
