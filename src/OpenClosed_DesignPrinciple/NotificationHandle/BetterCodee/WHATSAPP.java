package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

public class WHATSAPP implements NotificationService{

    @Override
    public void sendNotification(String recipient, String message) {
        // Logic to send WhatsApp message
        System.out.println("Sending WhatsApp message to " + recipient + " with message: " + message);

    }
}
