package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

public class TELEGRAM implements  NotificationService{

    @Override
    public void sendNotification(String recipient, String message) {
        // logic to send message to telegram
        System.out.println("Sending Telegram message to " + recipient + " with message: " + message);
    }

}
