package SingleResponsibility_DesignPrinciple.UserOrderManager.ProblematicCode;

class Order{
    // .. some properties
}

class User {
    // .. some properties
}

public class OrderProcessor {
    public void processOrder(Order order) {
        // Code to process the order
    }

    public void calculateTotalSum(Order order) {
        // Code to calculate total sum
    }

    public void sendEmailNotification(User user) {
        // Code to send email notifications
    }
}


/*
     what is the problem of this class of OrderProcessor

   -> Why this violates SRP:
        1. Order Processing: This involves handling the order itself—likely updating status, saving to a database,
        or invoking other business logic.

        2. Total Sum Calculation: This is a calculation task that might require logic specifically for calculating
        totals for the order.

        3. Email Notification: Sending notifications is a separate concern, likely involving external services or
        communication logic.

    -> How to Refactor:
        To adhere to SRP, we should separate the responsibilities into distinct classes, each focusing on a single task

        we write this Better Code Which follow the Single Responsibility Design Principle : in BetterCode Folder
 */