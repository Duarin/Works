package com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface important {
}

public class Task {

    @important
    public void completed(){
     System.out.println("Task completed");
 }

 public  void taskStarted(){
     System.out.println("Task started");
 }

 @important
 public void taskReview(){
     System.out.println("Task reviewed");
 }
}
