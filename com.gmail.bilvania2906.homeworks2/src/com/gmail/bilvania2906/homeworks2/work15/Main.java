package com.gmail.bilvania2906.homeworks2.work15;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        ShapeAreaCalculator calculateRectangleArea= new ShapeAreaCalculator() {
            @Override
            public double calculateArea(double length, double wight) {
                return length*wight;
            }
        };
        System.out.println("Площа прямокутника 5*5 : "+calculateRectangleArea.calculateArea(5,5));

        InvertLine reverseLine= s-> new StringBuffer(s).reverse().toString();
        System.out.println("Reverse string "+reverseLine.invert("This line will be reverse"));

        Function<String,Integer> countWords = WordCounter::wordCounter;
        System.out.println("Count of words: "+countWords.apply("This line have 5 words"));

        Function<Double,Double> celsiusToFahrenheit=TemperatureConverter::celsiusToFahrenheit;
        System.out.println("25 celsius to fahrenheit is: "+celsiusToFahrenheit.apply(25.0));

        Supplier<String> randomStringSupplier= ()->RandomStringGenerator.generateRandomString(5);
        System.out.println("Random chars in string "+randomStringSupplier.get());
    }
}
