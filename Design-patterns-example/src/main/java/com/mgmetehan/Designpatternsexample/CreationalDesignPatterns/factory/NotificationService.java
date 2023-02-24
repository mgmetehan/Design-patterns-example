package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.factory;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(NotificationType.SMS);
        notification.notifyUser();
    }
    // * Notification -> SMSNotification -> MailNotification -> PushNotification -> NotificationFactory -> NotificationService
}
