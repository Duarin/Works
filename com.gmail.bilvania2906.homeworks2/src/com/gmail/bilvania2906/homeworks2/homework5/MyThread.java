package com.gmail.bilvania2906.homeworks2.homework5;


class MyThread extends Thread  {

    DataHandler dataHandler;

    public MyThread(String name, DataHandler dataHandler) {
        super(name);
        this.dataHandler = dataHandler;
    }

    @Override
    public void run() {
        dataHandler.getOutput();
    }
}


