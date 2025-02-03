package SingleResponsibility_DesignPrinciple.UserOrderManager.BetterCode;

public class EmailNotifier {

    // This method simulates sending an email to a user
    public void sendEmail(String emailAddress, String subject, String message) {
        // In a real-world scenario, you'd integrate with an email service (e.g., SendGrid, JavaMail, etc.)
        System.out.println("Sending email to " + emailAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }

}
