package com.example.utils;

import java.io.InputStream;
import java.nio.file.Paths;

public class FileUtility {

    // This method gets the file path for file system-based files
    public static String getFilePath(String fileName) {
        String projectRoot = System.getProperty("user.dir");

        // Ensure there's a separator
        return Paths.get(projectRoot, fileName).toString();
    }

    // This method gets the input stream of a resource file in the classpath (for files in src/main/resources)
    public static InputStream getResourceFileAsStream(String fileName) {
        ClassLoader classLoader = FileUtility.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        if (inputStream == null) {
            throw new IllegalArgumentException("File not found: " + fileName);
        }
        return inputStream;
    }
}



