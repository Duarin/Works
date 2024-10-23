package com.gmail.bilvania2906.homeworks2.work6;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler {

    public String writeToFile(Path path, String content) {

        try {
            Files.writeString(path, content);
            return "File written successfully";
        } catch (IOException e) {
            e.getMessage();
            return "Error, can`t find path to file";
        }
    }

    public String readFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            return String.join(System.lineSeparator(),lines);
        } catch (IOException e) {
            e.getMessage();
            return "Error, can`t find path to file";
        }


    }
}
