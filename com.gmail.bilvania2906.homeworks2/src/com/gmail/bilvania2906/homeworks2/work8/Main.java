package com.gmail.bilvania2906.homeworks2.work8;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private final static int size=10000000;
    private final static int numThread=4;
    private final static int[] array= new int[size];
    private final static AtomicInteger globalMax= new AtomicInteger(Integer.MIN_VALUE);

    public static void main(String[] args) {

        Random random=new Random();
        for (int i=0; i<size; i++){
            array[i]=random.nextInt(10000000);
        }

        int partSize=size/numThread;
        Thread[] thread= new Thread[numThread];

        for (int i=0;i<numThread;i++){
            final int start=i*partSize;
            final int end=(i == numThread - 1) ? size : (start + partSize);
        }
    }

}
