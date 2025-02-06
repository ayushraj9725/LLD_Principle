package OpenClosed_DesignPrinciple.Payment_Processor.BetterCodee;

import OpenClosed_DesignPrinciple.Payment_Processor.ProblemMaticCode.PaymentProcessor;

public class Controller {
    public static void main(String[] args) {
        // now we are controlling the payment using type

        Payment payWithPhonePay = new PhonePay();
        Payment payWithGooglePay = new GooglePay();
        Payment payWithCreditCard = new CreditCard();

        paymentProcessor doPayment1 = new paymentProcessor(payWithGooglePay);
        paymentProcessor doPayment2 = new paymentProcessor(payWithCreditCard);
        paymentProcessor doPayment3 = new paymentProcessor(payWithPhonePay);


        doPayment2.makePayment(payWithPhonePay);
        doPayment2.makePayment(payWithCreditCard);
        doPayment3.makePayment(payWithGooglePay);

    }
}
