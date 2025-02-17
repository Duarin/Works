package com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {

    int min() default Integer.MIN_VALUE;

    int max() default Integer.MAX_VALUE;

    boolean notNull() default false;
}
