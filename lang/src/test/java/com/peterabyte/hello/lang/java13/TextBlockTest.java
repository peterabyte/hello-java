package com.peterabyte.hello.lang.java13;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TextBlockTest {
    @Test
    public void givenTextBlockShouldEqualToMultiLineString() {
        String textBlock =
            """
            {
                "key_1": "value_1",
                "key_2": {
                    "key_2-1": "value_2-1",
                    "key_2-2": "value_2-2",
                    "key_2-3": "value_2-3",
                }
            }
            """;
        assertThat(textBlock).isEqualTo(
            "{\n" +
            "    \"key_1\": \"value_1\",\n" +
            "    \"key_2\": {\n" +
            "        \"key_2-1\": \"value_2-1\",\n" +
            "        \"key_2-2\": \"value_2-2\",\n" +
            "        \"key_2-3\": \"value_2-3\",\n" +
            "    }\n" +
            "}\n"
        );
    }
}
