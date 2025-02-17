package com.gmail.bilvania2906.homeworks2.work16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberComparator comparator = (a, b) -> a > b;

        System.out.println("Please enter number 1");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter number 2");
        double num2 = scanner.nextDouble();

        System.out.println("1)Is number 1:" + num1 + " bigger than number 2:" + num2 + "? " + comparator.compare(num1, num2));

        StringProcessor capitalizeWords = input -> {
            String[] words = input.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
            return String.join(" ", words);
        };
        String sentence = "java is awesome";
        String result = capitalizeWords.process(sentence);

        System.out.println(result);
    }
}
