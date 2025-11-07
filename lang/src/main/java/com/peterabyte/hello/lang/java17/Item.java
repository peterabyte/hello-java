package com.peterabyte.hello.lang.java17;

public sealed interface Item permits Device, Gadget {
    String getName();
}
