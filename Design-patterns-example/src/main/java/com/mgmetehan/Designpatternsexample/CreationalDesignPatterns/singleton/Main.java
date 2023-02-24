package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        /*EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton instance2 = EagerInitializationSingleton.getInstance();
        System.out.println(instance1 == instance2);
        instance1.math(7);
        instance2.math(2);*/
        //?----------------------------------------
        /*StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
        System.out.println(instance1 == instance2);
        instance1.math(5);
        instance2.math(3);*/
        //?----------------------------------------
        /*LazyInitializationSingleton instance1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();
        System.out.println(instance1 == instance2);
        instance1.math(8);
        instance2.math(12);*/
        //?----------------------------------------
        /*BillPughSingleton instance1 = BillPughSingleton.getInstance();
        instance1.print();*/
        //?----------------------------------------
        /*ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
        System.out.println(instance1 == instance2);*/
    }
}
