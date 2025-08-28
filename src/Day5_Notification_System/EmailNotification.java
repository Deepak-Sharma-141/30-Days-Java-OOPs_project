package Day5_Notification_System;

public class EmailNotification implements Notification{

    @Override
    public void send(User user, String message) {
        System.out.println("Email send to "+user.getEmail()+": "+message);
    }
}
