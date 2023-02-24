package com.mgmetehan.Designpatternsexample.singleton;

public class ThreadSafeSingleton {
    // ! Ayni anda birden fazla thread'in bu siniftan instance almasini engeller.
    // ! Ayni anda gelenleri sira ile bekletir.
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("ThreadSafeSingleton running...");
    }
}
