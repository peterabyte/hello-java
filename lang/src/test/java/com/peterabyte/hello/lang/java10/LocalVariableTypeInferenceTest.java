package com.peterabyte.hello.lang.java10;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class LocalVariableTypeInferenceTest {
    @Test
    public void givenVarIsStringShouldReturnInstanceOfString() {
        var str = "Hello Java 10";

        assertThat(str).isInstanceOf(String.class);
    }

    @Test
    public void givenVarIsGeneric() {
        var idToNameMap = new HashMap<Integer, String>();

        idToNameMap.put(1, "first");

        assertThat(idToNameMap.get(1)).isEqualTo("first");
    }
}
