package com.peterabyte.hello.lang.java21;

import java.util.UUID;

public class ThatThing implements Something{
    private final UUID ID = UUID.randomUUID();

    public UUID getUuid() {
        return ID;
    }
}
