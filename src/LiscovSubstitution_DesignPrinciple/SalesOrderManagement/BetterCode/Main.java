package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.BetterCode;

public class Main {

    public static void main(String[] args) {
        SalesOrder order = new SalesOrder();

        // Test actions in NewOrder state
        order.AddOrderLine(); // Valid
        order.Register();     // Valid, transitions to Registered state

        // Test actions in Registered state
        order.AddOrderLine(); // Valid
        order.Grant();         // Valid, transitions to Granted state

        // Test actions in Granted state
        order.AddOrderLine(); // Valid
        order.Ship();         // Valid, transitions to Shipped state

        // Test actions in Shipped state
        order.Invoice();     // Valid, transitions to Invoiced state

    }
}
