package OpenClosed_DesignPrinciple.Payment_Processor.BetterCodee;

public class paymentProcessor {
    private final Payment payment ;

    // this is dependency injections
    public paymentProcessor(Payment payment) {
        this.payment = payment;
    }
    // this is calling the paymentMethod  and make it Flexible
    public void makePayment(Payment payment){
        payment.paymentMake();
    }

}
