package Day5_Notification_System;

public class PushNotification implements Notification{
    @Override
    public void send(User user, String message) {
        System.out.println("Push Notification sent to "+user.getName()+": "+message);
    }
}
