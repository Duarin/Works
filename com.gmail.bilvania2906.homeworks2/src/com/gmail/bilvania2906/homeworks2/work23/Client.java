package com.gmail.bilvania2906.homeworks2.work23;

public class Client {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        car.move();
        plane.move();
    }
}

