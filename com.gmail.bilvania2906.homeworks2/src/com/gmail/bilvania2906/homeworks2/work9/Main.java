package com.gmail.bilvania2906.homeworks2.work9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        CountDownLatch startLatch = new CountDownLatch(5);
        CountDownLatch finishLatch = new CountDownLatch(1);
        AtomicInteger firstFinish = new AtomicInteger(-1);
        System.out.println("Ready... Set.... GO");

        for (int i = 0; i < 5; i++) {
            new Thread(new Cars(startLatch, finishLatch,firstFinish, i)).start();
        }
        try {
            startLatch.await();
            finishLatch.countDown();
            System.out.println("The first car to finishing the race was Car: " + firstFinish.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Race finished! All cars have crossed the finish line!");

    }

    public static class Cars extends Thread {
        private final CountDownLatch startLatch;
        private final CountDownLatch finishLatch;
        private final AtomicInteger firstFinish;
        private final int carId;


        Cars(CountDownLatch startLatch, CountDownLatch finishLatch, AtomicInteger firstFinish, int carId) {
            this.startLatch = startLatch;
            this.finishLatch = finishLatch;
            this.firstFinish = firstFinish;
            this.carId = carId;
        }


        @Override
        public void run() {

            try {
                System.out.println("Car number: " + carId + " started the race");
                Thread.sleep((long) (Math.random() * 5000));
                firstFinish.compareAndSet(-1, carId);
                startLatch.countDown();
                finishLatch.await();
                System.out.println("Car number: " + carId + ", has finished the race!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
