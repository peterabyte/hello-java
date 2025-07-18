package com.peterabyte.hello.lang.java9;

public class MyAutoCloseable implements AutoCloseable {
    private static boolean closed = false;

    @Override
    public void close() throws Exception {
        this.closed = true;
    }

    public boolean isClosed() {
        return closed;
    }
}
