package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

public class EMAIL implements NotificationService{
    @Override
    public void sendNotification(String recipient, String message) {

        // Logic to send email
        System.out.println("Sending Email to " + recipient + " with message: " + message);

    }
}
