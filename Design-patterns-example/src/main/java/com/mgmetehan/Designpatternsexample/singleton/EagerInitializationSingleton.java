package com.mgmetehan.Designpatternsexample.singleton;

public class EagerInitializationSingleton {
    // !! Uygulama basladiginda instance olusturulur.
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

    public static EagerInitializationSingleton getInstance() {
        return instance;
    }

    private EagerInitializationSingleton() {
    }

    int number=0;
    public void math(int num1){
        System.out.println("EagerInitializationSingleton math running...");
        System.out.println("sum: " + number);
        number+=num1;
        System.out.println("sum: " + number);
        System.out.println("EagerInitializationSingleton math stop...");
    }
}
