package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.singleton;

public class LazyInitializationSingleton {
    // ! Uygulama basladiginda instance olusturulmaz.
    // ! Instance istenildiginde olusturulur.
    // ! Nesne olusturulup olusturulmadigini kontrol eder ve olusturulmamissa olusturur.
    private static LazyInitializationSingleton instance;

    public static LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    private LazyInitializationSingleton() {
    }

    int number=0;
    public void math(int num1){
        System.out.println("LazyInitializationSingleton math running...");
        System.out.println("sum: " + number);
        number+=num1;
        System.out.println("sum: " + number);
        System.out.println("LazyInitializationSingleton math stop...");
    }
}
