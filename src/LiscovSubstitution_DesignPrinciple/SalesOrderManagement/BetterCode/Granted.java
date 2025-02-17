package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;

public class Granted implements OrderState{

    public void AddOrderLine(SalesOrder order) {
        System.out.println("Order line added in Granted state.");
    }
    public void Register(SalesOrder order) {
        throw new UnsupportedOperationException("Register not supported in Granted state.");
    }
    public void Grant(SalesOrder order) {
        throw new UnsupportedOperationException("Grant not supported in Granted state.");
    }
    public void Ship(SalesOrder order) {
        System.out.println("Order shipped. Transitioning to Shipped state.");
        order.setState(new Shipped());
    }
    public void Invoice(SalesOrder order) {
        throw new UnsupportedOperationException("Invoice not supported in Granted state.");
    }
    public void Cancel(SalesOrder order) {
        System.out.println("Order canceled. Transitioning to Cancelled state.");
        order.setState(new Cancelled());
    }
}
