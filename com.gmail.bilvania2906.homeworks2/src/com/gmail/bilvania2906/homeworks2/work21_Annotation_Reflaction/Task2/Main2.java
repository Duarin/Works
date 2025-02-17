package com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task2;

import com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task2.important;

import java.lang.reflect.Method;

public class Main2 {
    public static void main(String[] args) {
        Class<Task> clazz = Task.class;
        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Important methods in ClASS 'Task': ");
        for (Method method : methods) {
            if (method.isAnnotationPresent(important.class)) {
                System.out.println("- " + method.getName());
            }
        }


    }
}
