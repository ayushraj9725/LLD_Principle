package SingleResponsibility_DesignPrinciple.Smart_Inventory_Management_System.CodeBetter;


import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private final Map<String, Product> inventory;

    // Constructor
    public InventoryService() {
        inventory = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        inventory.put(product.getName(), product);
    }

    // Update the quantity of a product
    public void updateQuantity(String productName, int quantity) {
        if (inventory.containsKey(productName)) {
            Product product = inventory.get(productName);
            product.setQuantity(quantity);
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Check if stock is low
    public boolean isStockLow(String productName, int threshold) {
        if (inventory.containsKey(productName)) {
            return inventory.get(productName).getQuantity() < threshold;
        }
        return false;
    }

    // Get total inventory value
    public double getInventoryValue() {
        double totalValue = 0;
        for (Product product : inventory.values()) {
            totalValue += product.getQuantity() * product.getPrice();
        }
        return totalValue;
    }

    // Display inventory
    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
