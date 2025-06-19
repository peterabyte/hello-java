package com.peterabyte.hello.antlr;

import com.peterabyte.hello.antlr.context.PrintService;

public class SpyPrintService implements PrintService {
    private final StringBuilder out;
    private boolean empty;

    public SpyPrintService() {
        this.out = new StringBuilder();
        this.empty = true;
    }

    @Override
    public void print(Object value) {
        if (! empty) {
            out.append("\n");
        }
        out.append(value);
        empty = false;
    }

    public String getOutString() {
        return out.toString();
    }
}
