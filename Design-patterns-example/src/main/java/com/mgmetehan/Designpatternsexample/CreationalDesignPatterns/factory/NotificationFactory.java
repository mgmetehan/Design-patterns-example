package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.factory;

public class NotificationFactory {
    public Notification createNotification(NotificationType type) {
        switch (type) {
            case SMS:
                return new SmsNotification();
            case MAIL:
                return new MailNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
