package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;


public class Shipped implements OrderState {

    public void AddOrderLine(SalesOrder order) {
        throw new UnsupportedOperationException("AddOrderLine not supported in Shipped state.");
    }
    public void Register(SalesOrder order) {
        throw new UnsupportedOperationException("Register not supported in Shipped state.");
    }
    public void Grant(SalesOrder order) {
        throw new UnsupportedOperationException("Grant not supported in Shipped state.");
    }
    public void Ship(SalesOrder order) {
        throw new UnsupportedOperationException("Ship not supported in Shipped state.");
    }
    public void Invoice(SalesOrder order) {
        System.out.println("Order invoiced. Transitioning to Invoiced state.");
        order.setState(new Invoiced());
    }
    public void Cancel(SalesOrder order) {
        throw new UnsupportedOperationException("Cancel not supported in Shipped state.");
    }
}
