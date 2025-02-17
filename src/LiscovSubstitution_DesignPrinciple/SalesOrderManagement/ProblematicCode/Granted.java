package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.ProblematicCode;

public class Granted extends StateOrder{

    @Override
    void AddOrderLine() {
        System.out.println("Order line added in NewOrder state.");
    }

    @Override
    void Ship(){
        System.out.println("Order has been Shipped ");
    }

    @Override
    void Cancel(){
        System.out.println("Order Has Been Cancel ");
    }


}
