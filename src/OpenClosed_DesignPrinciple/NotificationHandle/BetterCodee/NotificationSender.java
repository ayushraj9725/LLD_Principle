package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

//Create a NotificationSender Class (Client Code)
//Now, we create a class that handles the sending of notifications, depending on the type of NotificationService passed to it.
// This class does not need to know about the concrete implementation of each notification type. It depends on the NotificationService interface

// This is the Client class which handle the notificationTypes and sending operation
public class NotificationSender {
    private final NotificationService notificationService;

    // Constructor injection for flexibility (Dependency Injection) : Polymorphism comes in work

    public NotificationSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    // Method to send the notification
    public void send(String recipient , String message) {
        notificationService.sendNotification(recipient, message);
    }

}
