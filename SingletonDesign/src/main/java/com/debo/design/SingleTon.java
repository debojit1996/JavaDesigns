package com.debo.design;

import java.util.Objects;

public class SingleTon {

    // Early/Eager initialization
//    private static SingleTon singleTon = new SingleTon();

    // By not initializing the object here, we are doing Lazy initialization, which can save
    // a lot of memory if this class's instance is never used via the getInstance method. But even with
    // lazy initialization, we are left with issue which may break the singleton characteristic
    // of this class, i.e., if we have two threads which are calling this getInstance method at the
    // same time. It might possible happen that both the threads executes the null check
    // Objects.isNull(singleTon) at the same time, which indeed you give two different instances
    // of this class SingleTon instead of a shared one. This could happen coz we are not applying
    // the synchronized keyword on the method or block of code which needs protection to avoid
    // creation of multiple instances.
    private static SingleTon singleTon;
    private int hello = 7;

    private SingleTon() {
        System.out.println("Instance created!!!");
    }

    // The synchronized keyword resolves the issue with a singleton class in case of a multithreaded
    // use-case. The further optimize things, the synchronized keyword can be applied on the block
    // of code where actually the race-condition could possibly arise( like only in around the null check
    // in this case)
    // public static synchronized SingleTon getInstance() (This is method level synchronization)
    public static SingleTon getInstance() {
        if (Objects.isNull(singleTon)) {
            synchronized (SingleTon.class) {
                // Double checked logging. Refer README.md for double checked logging for Singleton pattern
                if (Objects.isNull(singleTon)) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

    public int getHello() {
        return this.hello;
    }

    public void setHello(int hello) {
        this.hello = hello;
    }
}
