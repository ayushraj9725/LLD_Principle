package SingleResponsibility_DesignPrinciple.UserOrderManager.BetterCode;

import java.util.Arrays;

public class Controller {
    public static void main(String[] args) {
        // Create items
        OrderItem item1 = new OrderItem("Laptop", 70000.0, 2);  // Price = 1000, Quantity = 2
        OrderItem item2 = new OrderItem("Headphones", 15000.0, 3);  // Price = 150, Quantity = 3
        OrderItem item3 = new OrderItem("Mobile Phone" , 14000.0 , 2);


        // Create User Customer
        User user = new User("ayush0123" ,"Ayush Raj" ,"@ayushraj@123","Meerut City" ) ;

        // Create an order
        //  Order order = new Order("O123",user , Arrays.asList(item1,item2));
        // we can make this way or this way also

        Order order = new Order("0123" , user);
        // now we can make the call for adding items
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        // Calculate the total amount of the order
        order.calculateTotal();

        // Create the EmailNotifier and OrderProcessor
        EmailNotifier emailNotifier = new EmailNotifier();
        OrderProcessor orderProcessor = new OrderProcessor(emailNotifier);

        // Process the order and send email to the user
        orderProcessor.processOrder(order,user);

        // Output the total amount of the order
        System.out.println("Total amount for Order " + order.getOrderId() + ": Rs/- " + order.getTotalAmount());

    }
}

