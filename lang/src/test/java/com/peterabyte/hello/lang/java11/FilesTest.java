package com.peterabyte.hello.lang.java11;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

public class FilesTest {
    @Test
    public void givenFileShouldWriteAndRead() throws IOException {
        Path tempFile = Files.createTempFile("test", ".txt");

        Path file = Files.writeString(tempFile, "Hello Java 11!");
        var fileContent = Files.readString(file);

        assertThat(fileContent).isEqualTo("Hello Java 11!");
    }
}
