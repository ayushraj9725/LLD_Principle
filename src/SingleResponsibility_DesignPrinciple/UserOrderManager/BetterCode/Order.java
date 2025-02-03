package SingleResponsibility_DesignPrinciple.UserOrderManager.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private User customer; // Association with the User (the customer who placed the order)
    private List<OrderItem> items; // List of items in the order
    private String status; // Order status (e.g., "Pending", "Shipped", "Delivered")
    private double totalAmount; // Total amount of the order

    /*
    // Constructor   //  We can use either this constructor either that below

    public Order(String orderId, User customer, List<OrderItem> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.status = "Pending"; // Default status
        this.totalAmount = 0.0;
    }
    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
     */

    // Constructor

    public Order(String orderId,User customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }
    // Method to add an item to the order
    public void addItem(OrderItem item) {
        items.add(item);
    }

    // Method to get the list of items in the order
    public List<OrderItem> getItems() {
        return items;
    }

    // Getters and Setters  : Id Order

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to calculate the total price of the order
    public void calculateTotal() {
        totalAmount = 0.0;
        for (OrderItem item : items) {
            totalAmount += item.calculateTotal();  // Summing up the total of each item
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Add more methods if needed for additional logic


}

