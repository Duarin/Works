package com.gmail.bilvania2906.homeworks2.work9;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        AtomicInteger firstCar = new AtomicInteger(-1);
        StringBuilder results = new StringBuilder();  // Зберігаємо результати фінішів

        CyclicBarrier barrier = new CyclicBarrier(5, () -> {
            // Дія виконується після того, як всі потоки завершили роботу
            System.out.println(results.toString()); // Виводимо результати фінішів
            System.out.println("First car "+firstCar);
        });

        System.out.println("Ready... Set.... GO");

        for (int i = 0; i < 5; i++) {
            new Thread(new Cars(i, firstCar, barrier, results)).start();


        }


    }

    public static class Cars extends Thread {
        private final int carId;
        private final AtomicInteger firstCar;
        private final CyclicBarrier barrier;
        private final StringBuilder results;

        Cars(int carId, AtomicInteger firstCar, CyclicBarrier barrier, StringBuilder results) {
            this.carId = carId;
            this.firstCar = firstCar;
            this.barrier = barrier;
            this.results = results;
        }

        @Override
        public void run() {
            try {
                System.out.println("Car number: " + carId + " started the race");
                Thread.sleep((long) (Math.random() * 5000));  // Імітуємо різний час фінішу

                // Логіка фінішу
                if (firstCar.get() == -1) {
                    firstCar.compareAndSet(-1, carId); // Записуємо перший автомобіль, який фінішував
                }

                // Додаємо результат у спільний StringBuilder
                synchronized (results) {
                    results.append("Car number: ").append(carId).append(", has finished the race!\n");

                }


                // Усі машини чекають на бар'єр, щоб одночасно вивести результати
                barrier.await();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
