package com.gmail.bilvania2906.homeworks2.work5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class FileHandler {

    public String readFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            return String.join(System.lineSeparator(), lines);
        } catch (IOException e) {
            return "Something wrong " + e.getMessage();
        }
    }
}