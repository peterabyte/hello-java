package com.peterabyte.hello.lang.java22;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import org.junit.jupiter.api.Test;

public class ForeignFunctionMemoryApiTest {
    @Test
    public void shouldGetStringLength() throws Throwable {
        String str = "Hello Java!";

        long len = 0;
        SymbolLookup stdlib = Linker.nativeLinker().defaultLookup();
        MethodHandle strlen = Linker.nativeLinker().downcallHandle(
            stdlib.find("strlen").orElseThrow(),
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        try (Arena offHeap = Arena.ofConfined()) {
            MemorySegment strMemorySegment = offHeap.allocateFrom(str);
            len = (long) strlen.invoke(strMemorySegment);
        }

        assertThat(len).isEqualTo(str.length());
    }
}
