package com.gmail.bilvania2906.homeworks2.work2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileHandler handler = new FileHandler();
        String inputFileName = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\input.txt";
        String outputFileName = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\output.txt";

        List<String> ArrayOfLines = new ArrayList<>();

        String result = handler.readLines(inputFileName, outputFileName, ArrayOfLines);
        getOutput("Result is " + result);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
