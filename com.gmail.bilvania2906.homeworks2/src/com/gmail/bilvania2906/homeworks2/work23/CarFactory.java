package com.gmail.bilvania2906.homeworks2.work23;

public class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}