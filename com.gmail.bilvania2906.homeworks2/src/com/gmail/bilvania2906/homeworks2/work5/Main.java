package com.gmail.bilvania2906.homeworks2.work5;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        Path path = Path.of("C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\file1.txt");
        getOutput("FILE CONTENT: " + handler.readFromFile(path));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}