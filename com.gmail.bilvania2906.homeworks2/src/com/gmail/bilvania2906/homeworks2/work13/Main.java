package com.gmail.bilvania2906.homeworks2.work13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Додати товар");
        System.out.println("2. Видалити товар");
        System.out.println("3. Показати список");
        System.out.println("4. Перевірити наявність товару");
        System.out.println("5. Вийти");

        while (true) {

            System.out.println("Оберіть дію");

            int choise;
            try {
                choise = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Будь ласка, введіть число від 1 до 5.");
                continue;
            }
            switch (choise) {
                case 1:
                    System.out.println("Веддіть назіу товару: ");
                    String itemToAdd = scanner.nextLine();
                    list.add(itemToAdd);
                    System.out.println("Товар " + itemToAdd + " додано до списку.");
                    break;

                case 2:
                    System.out.println("Введіть назву для видалення: ");
                    String itemToRemove = scanner.nextLine();
                    if (list.remove(itemToRemove)) {
                        System.out.println("Товар " + itemToRemove + " видалено зі списка.");
                    } else {
                        System.out.println("Товар " + itemToRemove + " не знайдено у списку.");
                    }
                    break;

                case 3:
                    System.out.println("Ваш список покупок: ");
                    if (list.isEmpty()) {
                        System.out.println("Ваш список пустий.");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + "." + list.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Який товар шукаєте: ");
                    String itemToCheck = scanner.nextLine();
                    if (list.contains(itemToCheck)) {
                        System.out.println("Товар " + itemToCheck + " знайдено у списку");
                    } else {
                        System.out.println("Товар " + itemToCheck + " не знайдено у списку.");
                    }
                    break;

                case 5:
                    System.out.println("ПАКА");
                    scanner.close();
                    return;

                default:
                    System.out.println("Будь ласка, оберіть номер від 1 до 5.");
            }
        }
    }
}
