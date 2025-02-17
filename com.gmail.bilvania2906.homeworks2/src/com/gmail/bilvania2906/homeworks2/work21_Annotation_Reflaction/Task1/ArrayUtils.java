package com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodInfo{
    String methodName();

    String returnType();

    String description();

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Author {
    String firstName();

    String lastName();

}

class ArrayUtils {

    @MethodInfo(methodName = "findMax", returnType = "int", description = "method return max value of array")
    @Author(firstName = "Ivan", lastName = "Biliak")
    public static int findMax(int[] array) {
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    @MethodInfo(methodName = "reversedArr", returnType = "int[]", description = "method return reversed array ")
    @Author(firstName = "Ivan", lastName = "Biliak")
    public static int[] reversedArr(int[]array){
        int reverse[]=new int[array.length];
        for (int i=0;i<array.length; i++){
            reverse[i]=array[array.length-1-i];

        }
        return reverse;
    }
}
