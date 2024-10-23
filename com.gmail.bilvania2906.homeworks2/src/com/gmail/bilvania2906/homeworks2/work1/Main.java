package com.gmail.bilvania2906.homeworks2.work1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Введіть своє ім'я:");
        String nameInput = genericContainer.getInput(String.class, scanner);
        genericContainer<String> name = new genericContainer<>(nameInput);

        System.out.println("Введіть свій вік:");
        Integer ageInput = genericContainer.getInput(Integer.class, scanner);
        genericContainer<Integer> age = new genericContainer<>(ageInput);

        System.out.println("Твоє ім'я:\n"+name.getValue());
        System.out.println("Твій вік:\n"+age.getValue());



    }

    static class genericContainer<T> {

        private T value;

        public genericContainer(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
        public static <T> T getInput(Class<T> type, Scanner scanner) {
            if (type == Integer.class) {
                return type.cast(scanner.nextInt());
            } else if (type == Double.class) {
                return type.cast(scanner.nextDouble());
            } else if (type == String.class) {
                return type.cast(scanner.nextLine());
            }
            throw new IllegalArgumentException("Unsupported type: " + type.getName());
        }
    }


}
