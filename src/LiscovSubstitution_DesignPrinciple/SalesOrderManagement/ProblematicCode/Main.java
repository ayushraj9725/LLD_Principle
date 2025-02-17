package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.ProblematicCode;

public class Main {
    public static void main(String[] args) {
        SalesOrder order = new SalesOrder();

        // Test actions in NewOrder state
        order.AddOrderLine(); // Valid
        order.Register();     // Valid, transitions to Registered state

        // Invalid in NewOrder state (throws exception)
        try {
            order.Grant(); // Throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Now substitute with Shipped state
        order.setState(new Shipped());

        // Invalid in Shipped state (throws exception)
        try {
            order.AddOrderLine(); // Throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Valid in Shipped state
        order.Invoice(); // Works
    }
}
