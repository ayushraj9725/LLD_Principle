package OpenClosed_DesignPrinciple.Payment_Processor.BetterCodee;

public class CreditCard implements Payment{

    public void paymentMake(){
        System.out.println(" Make Payment with payment maker Credit Card");
        // don't know which type of payment made only care about to making payment !
    }
}
