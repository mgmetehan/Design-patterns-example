package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.factory;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SmsNotification -> sending an sms notification...");
    }
}
