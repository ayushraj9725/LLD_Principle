package SingleResponsibility_DesignPrinciple.Smart_Inventory_Management_System.CodeBetter;

public class ReportingService {
    private final InventoryService inventoryService;

    // Constructor
    public ReportingService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    // Generate inventory report
    public void generateInventoryReport() {
        System.out.println("===== Inventory Report =====");
        inventoryService.displayInventory();
        System.out.println("Total Inventory Value: $" + inventoryService.getInventoryValue());
    }
}
