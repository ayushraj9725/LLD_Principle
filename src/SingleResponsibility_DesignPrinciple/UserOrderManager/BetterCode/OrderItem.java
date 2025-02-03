package SingleResponsibility_DesignPrinciple.UserOrderManager.BetterCode;

public class OrderItem {
    private String itemName;
    private int quantity;
    private double price;

    // Constructor
    public OrderItem(String itemName, double price , int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Calculate total price for this item (price * quantity)

    public double calculateTotal() {
        return price * quantity;
    }


}

