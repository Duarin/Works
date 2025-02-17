package com.gmail.bilvania2906.homeworks2.work11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution= new Solution();
        int[] digits={9};
        int[] result=solution.plusOne(digits);

        System.out.println("Array"+Arrays.toString(result));
    }

  static class Solution {
      public int[] plusOne(int[] digits) {
          // Починаємо з останнього елемента масиву
          for (int i = digits.length - 1; i >= 0; i--) {
              if (digits[i] < 9) {
                  digits[i] += 1; // Додаємо 1, якщо число менше 9
                  return digits; // Повертаємо масив
              }
              digits[i] = 0; // Якщо цифра 9, встановлюємо її в 0 і продовжуємо далі
          }

          // Якщо всі елементи були 9, створюємо новий масив з додатковим місцем для 1
          int[] newDigits = new int[digits.length + 1];
          newDigits[0] = 1; // Встановлюємо перший елемент у 1
          return newDigits;
      }
  }
}

