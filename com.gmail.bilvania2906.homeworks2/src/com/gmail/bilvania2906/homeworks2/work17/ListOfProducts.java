package com.gmail.bilvania2906.homeworks2.work17;

import java.util.HashMap;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();
        System.out.println("It's your list of products");
        System.out.println("Enter product and number or enter 'exit' for exit ");

        while (true) {
            String answer = scanner.nextLine();
            String[] product = answer.split(" ");

            if (answer.equals("exit")) {
                System.out.println("Bye");
                break;
            }
            if (product.length != 2) {
                System.out.println("format not correct, enter answer in format 'product''number'");
                continue;
            }

            String productName = product[0];
            int quantity;
            try {
                quantity = Integer.parseInt(product[1]);
            } catch (NumberFormatException e) {
                System.out.println("Кількість має бути числом!");
                continue;
            }

            if (list.containsKey(productName)) {
                list.put(productName, list.get(productName) + quantity);
            } else {
                list.put(productName, quantity);
            }

            System.out.println("Product have added to your list! Enter new product ot 'exit'");
        }
        System.out.println("Final list of your products:" );
        for(String products: list.keySet()){
            System.out.println(products+": "+list.get(products));
        }
    }
}
