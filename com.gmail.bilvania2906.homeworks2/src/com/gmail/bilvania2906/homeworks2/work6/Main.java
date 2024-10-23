package com.gmail.bilvania2906.homeworks2.work6;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        Path path = Path.of("C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\myfile.txt");
        String content = "Some very very important information";

        String writeStatus = fileHandler.writeToFile(path, content);
        getOutput(writeStatus);

        String fileContent = fileHandler.readFromFile(path);
        getOutput("File content: \n" + fileContent );

    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
