package com.gmail.bilvania2906.homeworks2.work17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write input text: ");
        String inputText = scanner.nextLine();

        inputText = inputText.toLowerCase();

        String[] words = inputText.split("\\W+");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);

            }
        }

        System.out.println("Amount of words");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));

        }
        scanner.close();
    }
}
