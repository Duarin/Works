package com.gmail.bilvania2906.homeworks2.homework5;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    final String[] fruits = new DataRepository().getData();

    public void getOutput() {
        // критичний блок коду
        synchronized (this.fruits) {
            StringBuilder sb = new StringBuilder();
            AtomicInteger count=new AtomicInteger(1);
            count = new AtomicInteger(1);
            for (String fruit : fruits) {
                sb.append(String.format("(%d) %s ",
                        count.getAndIncrement(), fruit));
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
}
