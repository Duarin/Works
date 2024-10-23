package com.gmail.bilvania2906.homeworks2.work3;

import java.io.*;

public class Main {


    private static final String file1 = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\file1.txt";
    private static final String file2 = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\file2.txt";
    private static final String outputFile = "C:\\Users\\ivan\\IdeaProjects\\Homeworks2\\com.gmail.bilvania2906.homeworks2\\src\\com\\gmail\\bilvania2906\\homeworks2\\files\\output.txt";


    public static void main(String[] args) {
        try {
            // Очищуємо вихідний файл
            new FileWriter(outputFile, false).close();

            // Обробка першого файлу
            processFile(file1, outputFile);

            // Обробка другого файлу
            processFile(file2, outputFile);

            System.out.println("Інформацію з файлів успішно збережено до " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processFile(String inputFilePath, String outputFilePath) {
        int lineCount = 0;
        StringBuilder fileContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append(System.lineSeparator());
                lineCount++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String fileName=new File(inputFilePath).getName();
        String header= String.format("--- %s (%d lines) ---%n",fileName,lineCount);

        try(BufferedWriter writer=new BufferedWriter(new FileWriter(outputFilePath,true))){
            writer.write(header);
            writer.write(fileContent.toString());
            writer.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
