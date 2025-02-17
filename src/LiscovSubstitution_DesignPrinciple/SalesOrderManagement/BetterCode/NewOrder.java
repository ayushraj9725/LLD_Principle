package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;

public class NewOrder implements OrderState{
    public void AddOrderLine(SalesOrder order) {
        System.out.println("Order line added in NewOrder state.");
    }
    public void Register(SalesOrder order) {
        System.out.println("Order registered. Transitioning to Registered state.");
        order.setState(new Registered());
    }
    public void Grant(SalesOrder order) {
        throw new UnsupportedOperationException("Grant not supported in NewOrder state.");
    }
    public void Ship(SalesOrder order) {
        throw new UnsupportedOperationException("Ship not supported in NewOrder state.");
    }
    public void Invoice(SalesOrder order) {
        throw new UnsupportedOperationException("Invoice not supported in NewOrder state.");
    }
    public void Cancel(SalesOrder order) {
        System.out.println("Order canceled. Transitioning to Cancelled state.");
        order.setState(new Cancelled());
    }
}
