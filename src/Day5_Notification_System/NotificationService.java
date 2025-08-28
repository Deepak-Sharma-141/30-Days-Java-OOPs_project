package Day5_Notification_System;

public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification){
        this.notification=notification;
    }

    public void setNotification(Notification notification){
        this.notification=notification;
    }

    public void notifyUser(User user,String message){
        notification.send(user,message);
    }
}
