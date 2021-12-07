package com.java12.demo.java12Demo;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileMismatchTest {

    @Test
    public void when_Same_Files_then_Not_FindMismatch() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Path filePath3 = Files.createTempFile("file3", ".txt");
        Files.writeString(filePath1, "Hello From Java 12");
        Files.writeString(filePath2, "Hello From Java 12");
        Files.writeString(filePath3, "Hellow From Java 12");

        long mismatch = Files.mismatch(filePath1, filePath2);
        assertEquals(-1, mismatch);

        mismatch = Files.mismatch(filePath1, filePath3);
        assertEquals(5, mismatch);  //Provides the first - index/position where the difference in file is seen.

    }
}
