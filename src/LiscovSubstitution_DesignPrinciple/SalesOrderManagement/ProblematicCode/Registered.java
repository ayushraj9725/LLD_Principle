package LiscovSubstitution_DesignPrinciple.SalesOrderManagement.ProblematicCode;

public class Registered extends StateOrder{

    @Override
    void AddOrderLine() {
        System.out.println("Order line added in NewOrder state.");
    }

    @Override
    void Grant(){
        System.out.println("Order Added in Grant State ");
    }

    @Override
    void Cancel(){
        System.out.println("Order Has been Cancel ");
    }


}
