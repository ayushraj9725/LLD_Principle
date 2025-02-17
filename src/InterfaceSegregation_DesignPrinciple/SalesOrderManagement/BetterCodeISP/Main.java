package InterfaceSegregation_DesignPrinciple.SalesOrderManagement.BetterCodeISP;

public class Main {
    public static void main(String[] args) {

        SalesOrder order = new SalesOrder();

        // Test actions in NewOrder state
        try {
            order.AddOrderLine(); // Valid
            order.Register();     // Valid, transitions to Registered state
        }catch (UnsupportedOperationException e){
            System.out.println("Error :"+e.getMessage());
        }

        // Test actions in Registered state
        try {
            order.AddOrderLine(); // Valid
            order.Grant();         // Valid, transitions to Granted state
        }catch (UnsupportedOperationException e){
            System.out.println("Error :"+e.getMessage());
        }

        // Test actions in Granted state
        try {
            order.AddOrderLine(); // Valid
            order.Ship();         // Valid, transitions to Shipped state
        }catch (UnsupportedOperationException e){
            System.out.println("Error :" + e.getMessage());
        }

        // Test actions in Shipped state
        order.Invoice();     // Valid, transitions to Invoiced state

        // if we want to cancel order we can do that , cancel the new Added Order
        order = new SalesOrder();

        try {
            order.AddOrderLine();
            order.Cancel();
        }catch (UnsupportedOperationException e){
            System.out.println("Error :"+e.getMessage());

        }


    }
}
