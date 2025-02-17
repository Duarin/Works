package com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task1;

import com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task1.ArrayUtils;
import com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task1.Author;
import com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task1.MethodInfo;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;


        for (Method method : clazz.getDeclaredMethods()) {
            MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
            Author author = method.getAnnotation(Author.class);
            System.out.println("Method Name: " + methodInfo.methodName());
            System.out.println("Return Type: " + methodInfo.returnType());
            System.out.println("Description: " + methodInfo.description());
            System.out.println("Author: " + author.firstName() + " " + author.lastName());
            System.out.println("---------------------------------");
        }


        int[] simpleArray = {1, 22, 42, 12, 2, 4};
        System.out.println("Max value in array is: " + ArrayUtils.findMax(simpleArray));

        int[] reversedArray = {1, 22, 42, 12, 2, 4};
        System.out.println("Reversed array: " + Arrays.toString(ArrayUtils.reversedArr(reversedArray)));
    }
}
