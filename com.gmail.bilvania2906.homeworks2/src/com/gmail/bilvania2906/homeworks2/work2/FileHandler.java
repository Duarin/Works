package com.gmail.bilvania2906.homeworks2.work2;

import java.io.*;
import java.util.List;

public class FileHandler {

    public String readLines(String inputFileName, String outputFileName, List<String> ArrayOfLines) {

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))
        ){
            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
            return "Дані успішно скопійовано";
        }  catch (IOException e) {
            e.printStackTrace();
            return "Помилка";// Обробка помилок
        }
    }
}