package com.mgmetehan.Designpatternsexample.singleton;

public class BillPughSingleton {
    // ! static nested class olusturur ve nesneyi olusturur.
    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void print() {
        System.out.println("BillPughSingleton running...");
    }
}
