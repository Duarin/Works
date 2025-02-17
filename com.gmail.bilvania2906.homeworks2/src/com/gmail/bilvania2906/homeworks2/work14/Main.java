package com.gmail.bilvania2906.homeworks2.work14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Addition result:" + addition.operate(5, 5));

        StringManipulator toUpperCase = s -> s.toUpperCase();
        System.out.println("Words to uppercase: " + toUpperCase.manipulate("Ebal ja vse"));

        Function<String, Integer> countUpperCaseFunction = StringListProcessor::countUppercase;
        String line = "WE are The beSt";
        Integer countUpperCase = countUpperCaseFunction.apply(line);
        System.out.println("How much chars in uppercase: " + countUpperCase);

        Supplier<Integer> randomSupplier = ()-> RandomNumberGenerator.generateRandomNumber(1,100);
        System.out.println("Random number"+randomSupplier.get());
    }
}
