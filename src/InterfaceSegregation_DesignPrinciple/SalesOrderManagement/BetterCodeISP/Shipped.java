package InterfaceSegregation_DesignPrinciple.SalesOrderManagement.BetterCodeISP;

public class Shipped implements OrderState, InvoiceSupport{

    public void Invoice(SalesOrder order) {
        System.out.println("Order invoiced. Transitioning to Invoiced state.");
        order.setState(new Invoiced());
    }
}
