package com.peterabyte.hello.lang.java15;

public final class Present extends Box {
    private final String from;
    private final String to;

    public Present(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String label() {
        return "From: "+ from + " -> To: " + to;
    }
}
