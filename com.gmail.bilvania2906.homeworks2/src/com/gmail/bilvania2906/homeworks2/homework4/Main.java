package com.gmail.bilvania2906.homeworks2.homework4;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private static final String BASE_PATH = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String newFileName = "myfile1";
        String content = "Super information.";
        String path = BASE_PATH + newFileName + ".txt";
        // Виклики методів маніпуляції з файлом
        getOutput(handler.createFile(Path.of(path)));
        getOutput(handler.writeToFile(Paths.get(path), content));
        getOutput("CONTENT: " + handler.readFromFile(Path.of(path)));
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

