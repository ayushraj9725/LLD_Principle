package InterfaceSegregation_DesignPrinciple.SalesOrderManagement.BetterCodeISP;

public class Registered implements OrderState, AddOrderLineSupport, GrantSupport, CancelSupport{


    public void AddOrderLine(SalesOrder order) {
        System.out.println("Order line added in Registered state.");
    }
    public void Grant(SalesOrder order) {
        System.out.println("Order granted. Transitioning to Granted state.");
        order.setState(new Granted());
    }
    public void Cancel(SalesOrder order) {
        System.out.println("Order canceled. Transitioning to Cancelled state.");
        order.setState(new Cancelled());
    }

}
