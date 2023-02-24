package com.mgmetehan.Designpatternsexample.singleton;

public class StaticBlockSingleton {
    // ! Eager initialization ile ayni mantikla calisir.
    // ! Farki, instance olusturulurken hata yakalarsa exception firlatilabilir.
    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance",e);
        }
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    int number=0;
    public void math(int num1){
        System.out.println("StaticBlockSingleton math running...");
        System.out.println("sum: " + number);
        number+=num1;
        System.out.println("sum: " + number);
        System.out.println("StaticBlockSingleton math stop...");
    }
}

