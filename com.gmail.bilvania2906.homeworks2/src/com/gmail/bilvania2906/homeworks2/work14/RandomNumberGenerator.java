package com.gmail.bilvania2906.homeworks2.work14;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
