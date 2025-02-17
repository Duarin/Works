package com.gmail.bilvania2906.homeworks2.work21_Annotation_Reflaction.Task3;

public class User {
    @Validate(notNull = true)
    String name;

    @Validate(min = 18, max = 66)
    int age;

    @Validate(notNull = true)
    String email;

    public User(String name, int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
