package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

public class SMS implements NotificationService{

    @Override
    public void sendNotification(String recipient, String message) {
        // Logic to send email
        System.out.println("Sending SMS to " + recipient + " with message: " + message);

    }
}
