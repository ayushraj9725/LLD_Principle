package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.ProblematicCode;

public class Shipped extends  StateOrder{
    @Override
    void Invoice() {
        System.out.println("Order invoiced. Transitioning to Invoiced state.");
    }

}
