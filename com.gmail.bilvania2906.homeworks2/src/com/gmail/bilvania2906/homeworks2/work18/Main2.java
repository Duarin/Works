package com.gmail.bilvania2906.homeworks2.work18;

import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Bob", "Alice", "Alex", "Charlie");
        List<String> sortedListOfNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .toList();

        System.out.println(sortedListOfNames);
    }
}
