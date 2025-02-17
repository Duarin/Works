package com.gmail.bilvania2906.homeworks2.work24;

public class Address {
    private final String street;
    private final String city;
    private final String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getFullAddress() {
        return street + ", " + city + ", " + country;
    }
}
