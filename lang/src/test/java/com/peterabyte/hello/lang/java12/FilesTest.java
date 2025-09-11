package com.peterabyte.hello.lang.java12;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

public class FilesTest {
    @Test
    public void givenMatchingFilesShouldNotMismatch() throws IOException {
        Path fileA = Files.createTempFile("file_a", ".txt");
        Path fileB = Files.createTempFile("file_b", ".txt");
        Files.writeString(fileA, "Hello Java 11 test!");
        Files.writeString(fileB, "Hello Java 11 test!");

        long mismatch = Files.mismatch(fileA, fileB);

        assertThat(mismatch).isEqualTo(-1);
    }

    @Test
    public void givenNotMatchingFilesShouldMismatch() throws IOException {
        Path fileA = Files.createTempFile("file_a", ".txt");
        Path fileB = Files.createTempFile("file_b", ".txt");
        Files.writeString(fileA, "Hello Java 11 test!");
        Files.writeString(fileB, "Hello Java 11 demo!");

        long mismatch = Files.mismatch(fileA, fileB);

        assertThat(mismatch).isEqualTo(14L);
    }
}
