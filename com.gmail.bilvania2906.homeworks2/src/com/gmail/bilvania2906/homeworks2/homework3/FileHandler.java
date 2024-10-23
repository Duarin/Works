package com.gmail.bilvania2906.homeworks2.homework3;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileHandler {

    private final static String BASE_PATH = "files/";

    public String writeFile(String fileContent, String fileName) {
        try(FileWriter fw = new FileWriter( BASE_PATH+ fileName + ".txt")) {
           fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
           return e.getMessage();
        }
    }

    public String readFile(String path) {

        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(path)) {
            int sym;
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return path;
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
