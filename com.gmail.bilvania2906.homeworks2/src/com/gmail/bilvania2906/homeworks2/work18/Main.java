package com.gmail.bilvania2906.homeworks2.work18;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static class Employee {
        private final int id;
        private final String name;
        private final String department;
        private final double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public static List<Employee> getEmployees() {
            return List.of(
                    new Employee(1, "Alice", "IT", 6000),
                    new Employee(2, "Bob", "HR", 4000),
                    new Employee(3, "Charlie", "IT", 5500),
                    new Employee(4, "Diana", "Marketing", 3000),
                    new Employee(5, "Eve", "IT", 7500),
                    new Employee(6, "Frank", "HR", 5000)


            );

        }


        public static void main(String[] args) {

            List<Employee> employees = Employee.getEmployees();
            List<Employee> HighSalaryEmployees = employees.stream()
                    .filter(employee -> employee.getSalary() > 5000)
                    .collect(Collectors.toList());
            System.out.println("\n1. Співробітники із зарплатою > 5000:");
            HighSalaryEmployees.forEach(System.out::println);


            Map<String,Long> employeeByDepartament = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
            System.out.println("\n2. Кількість співробітників у кожному відділі:");
            employeeByDepartament.forEach((department,count)->
                    System.out.println(department+": "+count));

            List<Employee> sortedHighSalaryEmployees =  employees.stream()
                    .filter(employee -> employee.getSalary() > 5000)
                    .sorted(Comparator.comparing(Employee::getSalary))
                    .collect(Collectors.toList());
            System.out.println("\n3. Співробітники із зарплатою > 5000, відсортовані за зарплатою:");
            sortedHighSalaryEmployees.forEach(System.out::println);


            double averageSalary =employees.stream()
                    .mapToDouble(Employee::getSalary)
                    .average()
                    .orElse(0.0);
            System.out.println("\n4. Середня зарплата всіх співробітників: " + averageSalary);

            Employee highestPaidEmployee= employees.stream()
                    .max(Comparator.comparing(Employee::getSalary))
                    .orElse(null);
            System.out.println("\n5. Співробітник із максимальною зарплатою:");
            System.out.println(highestPaidEmployee);
        }
    }
}
