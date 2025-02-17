package com.gmail.bilvania2906.homeworks2.work24;

public class User {
    private String name;
    private Address address; // Клас Address як поле

    public User(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void displayUserInfo() {
        System.out.println("User: " + name);
        if (address != null) {
            System.out.println("Address: " + address.getFullAddress());
        } else {
            System.out.println("Address: Not set");
        }
    }
}
