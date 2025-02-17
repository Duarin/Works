package com.gmail.bilvania2906.homeworks2.work18;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 25, "Kyiv"),
                new Person("Bob", 17, "Lviv"),
                new Person("Charlie", 22, "Kyiv"),
                new Person("Diana", 19, "Odesa"),
                new Person("Eve", 30, "Lviv")
        );

        Map<String, List<String>> sortedByCity = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> new Person(person.getName().toUpperCase(), person.getAge(), person.getCity()))
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.mapping(Person::getName, Collectors.toList())
                ));
        System.out.println(sortedByCity);



    }

    static class Person {
        private String name;
        private String city;
        private int age;

        public Person(String name, int age, String city) {
            this.name = name;
            this.city = city;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return name + " (" + age + ", " + city + " )";
        }
    }
}
