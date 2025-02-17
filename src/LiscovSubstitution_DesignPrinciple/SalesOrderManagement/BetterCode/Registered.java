package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;

public class Registered implements OrderState{

    public void AddOrderLine(SalesOrder order) {
        System.out.println("Order line added in Registered state.");
    }
    public void Register(SalesOrder order) {
        throw new UnsupportedOperationException("Register not supported in Registered state.");
    }
    public void Grant(SalesOrder order) {
        System.out.println("Order granted. Transitioning to Granted state.");
        order.setState(new Granted());
    }
    public void Ship(SalesOrder order) {
        throw new UnsupportedOperationException("Ship not supported in Registered state.");
    }
    public void Invoice(SalesOrder order) {
        throw new UnsupportedOperationException("Invoice not supported in Registered state.");
    }
    public void Cancel(SalesOrder order) {
        System.out.println("Order canceled. Transitioning to Cancelled state.");
        order.setState(new Cancelled());
    }
}
