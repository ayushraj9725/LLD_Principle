package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.ProblematicCode;

// Subclasses override only the methods they support
class NewOrder extends StateOrder {

    @Override
    void AddOrderLine() {
        System.out.println("Order line added in NewOrder state.");
    }
    @Override
    void Register() {
        System.out.println("Order registered. Transitioning to Registered state.");
    }
    @Override
    void Cancel() {
        System.out.println("Order canceled. Transitioning to Cancelled state.");
    }

}
