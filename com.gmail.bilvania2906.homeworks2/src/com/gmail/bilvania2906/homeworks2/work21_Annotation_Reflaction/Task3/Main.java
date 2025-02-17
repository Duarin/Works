package com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task3;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        User user = new User(null, 13, "iaKrut777@gamail.com");
        validate(user);
    }

    public static void validate(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Validate.class)) {
                    field.setAccessible(true);
                    Object value = field.get(object);

                    if (field.isAnnotationPresent(Validate.class)) {
                        Validate validate = field.getAnnotation(Validate.class);
                        if (validate.notNull() && value == null) {
                            System.out.printf("Field '%s' must not be null.%n", field.getName());
                        }
                        if (value instanceof Integer) {
                            int intValue = (int) value;
                            if (intValue < validate.min() || intValue > validate.max()) {
                                System.out.printf("Field '%s' must be between %d and %d. Current value: %d%n",
                                        field.getName(), validate.min(), validate.max(), intValue);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
