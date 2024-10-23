package com.gmail.bilvania2906.homeworks2.work4;

import java.io.*;
import java.util.Arrays;

public class ProcessFile {
    public static void processFile(String inputFilePath, String outputFilePath) {

        StringBuilder fileContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append(System.lineSeparator());

            }

            String[] numberString = fileContent.toString().trim().split("\\s+");
            int[] numbers = new int[numberString.length];
            int i;

            for (i = 0; i < numberString.length; i++) {
                numbers[i] = Integer.parseInt(numberString[i]);
            }

            int sum = 0;
            int max = numbers[0];
            int min = numbers[0];

            for (int number : numbers) {
                sum += number;

                if (max < number) {
                    max = number;
                }

                if (min > number) {
                    min = number;
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) {
                writer.write("Input file content:" + System.lineSeparator());
                writer.write(fileContent.toString());
                writer.write("Numbers array: " + Arrays.toString(numbers) + System.lineSeparator());
                writer.write("Sum of all numbers in array is: " + sum + System.lineSeparator());
                writer.write("Max value in Array is: " + max + System.lineSeparator());
                writer.write("Min value in array is: " + min + System.lineSeparator());
                writer.newLine();


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
