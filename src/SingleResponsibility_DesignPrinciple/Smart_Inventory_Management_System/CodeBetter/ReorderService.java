package SingleResponsibility_DesignPrinciple.Smart_Inventory_Management_System.CodeBetter;

public class ReorderService {
    private InventoryService inventoryService;
    private int reorderThreshold;

    // Constructor
    public ReorderService(InventoryService inventoryService, int reorderThreshold) {
        this.inventoryService = inventoryService;
        this.reorderThreshold = reorderThreshold;
    }

    // Check and reorder products
    public void checkAndReorder(String productName) {
        if (inventoryService.isStockLow(productName, reorderThreshold)) {
            System.out.println("Reorder placed for: " + productName);
            // Logic to place reorder (e.g., update quantity or notify supplier)
        } else {
            System.out.println("Stock is sufficient for: " + productName);
        }
    }
}
