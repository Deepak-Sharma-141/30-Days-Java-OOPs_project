package Day5_Notification_System;

public class SMSNotification implements Notification{
    @Override
    public void send(User user, String message) {
        System.out.println("SMS sent to "+user.getPhone()+": "+message);

    }
}
