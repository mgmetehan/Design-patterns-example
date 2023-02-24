package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.factory;

public class MailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("MailNotification -> sending an mail notification...");
    }
}
