package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.factory;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory.createNotification(NotificationType.MAIL).notifyUser();
    }
    // * Notification -> SMSNotification -> MailNotification -> NotificationFactory -> NotificationType -> NotificationService
}
