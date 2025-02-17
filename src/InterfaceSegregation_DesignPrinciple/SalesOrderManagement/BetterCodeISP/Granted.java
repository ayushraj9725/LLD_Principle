package InterfaceSegregation_DesignPrinciple.SalesOrderManagement.BetterCodeISP;

public class Granted implements OrderState, AddOrderLineSupport, ShipSupport, CancelSupport {

    public void AddOrderLine(SalesOrder order) {
        System.out.println("Order line added in Granted state.");
    }
    public void Ship(SalesOrder order) {
        System.out.println("Order shipped. Transitioning to Shipped state.");
        order.setState(new Shipped());
    }
    public void Cancel(SalesOrder order) {
        System.out.println("Order canceled. Transitioning to Cancelled state.");
        order.setState(new Cancelled());
    }

}
