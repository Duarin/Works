package com.gmail.bilvania2906.homeworks2.work24;
public class Main {
    public static void main(String[] args) {
        User user = new User("Ivan Biliak");
        Address address = new Address("Kolo 65", "Lublin", "Poland");

        user.setAddress(address);
        user.displayUserInfo();
    }
}
