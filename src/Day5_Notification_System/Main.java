package Day5_Notification_System;

public class Main {
    public static void main(String[] args){
        User user = new User("Deepak Sharma","deepak@gmail.com","987456123");

        NotificationService service = new NotificationService(new EmailNotification());
        service.notifyUser(user,"Welcome to our platform!");

        service.setNotification(new SMSNotification());
        service.notifyUser(user,"Your OTP is 123456");

        service.setNotification(new PushNotification());
        service.notifyUser(user,"Your have a new friend request");
    }
}
