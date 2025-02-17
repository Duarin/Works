package com.gmail.bilvania2906.homeworks2.work10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Task[] tasks = new Task[10];
        for (int i =0; i< tasks.length; i++){
            tasks[i]=new SimpleTask("Task"+i);
        }

        BlockingQueue<Task> taskQueue= new LinkedBlockingQueue<>();
        for(Task task:tasks){
            taskQueue.add(task);
        }
    }

    interface Task {
        void execute() throws InterruptedException;
    }


    public static class SimpleTask implements Task {
        private final String name;

        public SimpleTask(String name) {
            this.name = name;
        }

        @Override
        public void execute() throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " is processing" + name);
            Thread.sleep((long) (Math.random() * 2000));
            System.out.println(Thread.currentThread().getName() + " has finished" + name);
        }
    }

    public static class Worker extends Thread {
        private final BlockingQueue<Task> taskQueue;
        public Worker(BlockingQueue<Task> taskQueue) {
            this.taskQueue = taskQueue;
        }
        @Override
        public void run() {
            try {
                while (true) {
                    Task task = taskQueue.take();
                    task.execute();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
