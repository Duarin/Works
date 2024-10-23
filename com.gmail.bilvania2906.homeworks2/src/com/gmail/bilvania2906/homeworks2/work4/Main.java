package com.gmail.bilvania2906.homeworks2.work4;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static final String input = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\input.txt";
    public static final String output = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\output.txt";

    public static void main(String[] args) {
        try {
            new FileWriter(input, false).close();
            FillFileWithRandomNumbers.fillFileWithRandomNumbers(input);
            new FileWriter(output, false).close();
            ProcessFile.processFile(input, output);


            System.out.println("Information from file success read and writed in array");

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
