package SingleResponsibility_DesignPrinciple.UserOrderManager.BetterCode;

public class OrderProcessor {
    private EmailNotifier emailNotifier;

    // Constructor: inject the EmailNotifier dependency
    public OrderProcessor(EmailNotifier emailNotifier) {
        this.emailNotifier = emailNotifier;
    }

    // Method to process the order
    public void processOrder(Order order , User user) {
        // Step 1: Update order status
        order.setStatus("Processed");  // Update status to "Processed"

        // Step 2: Send email to user
        String subject = "Order " + order.getOrderId() + " - Status Update";
        String message = "Dear Customer "+  user.getUserId() +  ", your order has been processed.\n"
                + "your status has been " + order.getStatus()
                + "\nTotal amount: Rs/- " + order.getTotalAmount()
                + "\n\nThank you for shopping with us !";

        // Send email to the user
        emailNotifier.sendEmail(user.getEmail(), subject, message);

        // Output confirmation (optional)
        System.out.println("\nOrder " + order.getOrderId() + " has been processed." + " to the " + user.getUserId());
    }
}
