package com.gmail.bilvania2906.homeworks2.work14;

public class StringListProcessor {
    public static int countUppercase(String s){
       int count=0;
       for (char i:s.toCharArray()){
           if(Character.isUpperCase(i)){
               count++;
           }
       }
       return count;
    }
}
