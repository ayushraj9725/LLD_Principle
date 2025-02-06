package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

public interface NotificationService {
    void sendNotification(String recipient , String message);

    // this is interface only care about the sending notification which types go to send don't care it
    // where it is implemented there it will work
}
