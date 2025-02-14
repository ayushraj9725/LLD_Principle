package SingleResponsibility_DesignPrinciple.Smart_Inventory_Management_System.CodeBetter;

public class Controller {
    public static void main(String[] args) {
        // Create services
        InventoryService inventoryService = new InventoryService();
        ReorderService reorderService = new ReorderService(inventoryService, 10); // Reorder threshold = 10
        NotificationService notificationService = new NotificationService();
        ReportingService reportingService = new ReportingService(inventoryService);

        // Add products to inventory
        inventoryService.addProduct(new Product("Laptop", 15, 1200.0));
        inventoryService.addProduct(new Product("Phone", 5, 800.0));
        inventoryService.addProduct(new Product("Headphones", 20, 100.0));

        // Check and reorder products
        reorderService.checkAndReorder("Phone"); // Reorder placed for: Phone
        reorderService.checkAndReorder("Laptop"); // Stock is sufficient for: Laptop

        // Send notifications
        notificationService.sendNotification("Stock is low for Phone. Reorder placed.");

        // Generate inventory report
        reportingService.generateInventoryReport();


    }
}
