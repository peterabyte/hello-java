package com.peterabyte.hello.antlr.context;

public class DefaultPrintService implements PrintService {
    @Override
    public void print(Object value) {
        System.out.println(value);
    }
}
