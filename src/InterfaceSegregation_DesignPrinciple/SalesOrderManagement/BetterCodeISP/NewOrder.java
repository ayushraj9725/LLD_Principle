package InterfaceSegregation_DesignPrinciple.SalesOrderManagement.BetterCodeISP;

public class NewOrder implements OrderState, AddOrderLineSupport, RegisterSupport, CancelSupport{

    public void AddOrderLine(SalesOrder order) {
        System.out.println("Order line added in NewOrder state.");
    }
    public void Register(SalesOrder order) {
        System.out.println("Order registered. Transitioning to Registered state.");
        order.setState(new Registered());

    }
    public void Cancel(SalesOrder order) {
        System.out.println("Order canceled. Transitioning to Cancelled state.");
        order.setState(new Cancelled());
    }

}
