package com.gmail.bilvania2906.homeworks2.work4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FillFileWithRandomNumbers {
    public static void fillFileWithRandomNumbers(String inputFilePath) {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFilePath))) {
            int count = 100;
            int min = 0;
            int max = 100;
            Random random = new Random();

            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt((max - min) + min);
                writer.write(randomNumber + " ");

                if ((i + 1) % 10 == 0) {
                    writer.newLine();
                }

            }

        } catch (IOException e) {
            System.err.println("Error writing to file" + e.getMessage());
        }
    }
}
