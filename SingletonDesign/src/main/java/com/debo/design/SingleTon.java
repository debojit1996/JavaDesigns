package com.debo.design;

public class SingleTon {

    // Early/Eager initialization
    private static SingleTon singleTon = new SingleTon();
    private int hello = 7;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        return singleTon;
    }

    public int getHello() {
        return this.hello;
    }

    public void setHello(int hello) {
        this.hello = hello;
    }
}
