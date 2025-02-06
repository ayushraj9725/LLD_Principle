package OpenClosed_DesignPrinciple.Payment_Processor.ProblemMaticCode;

import java.util.Arrays;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        // we are want to control over the payment processor
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        List<PaymentType> payTypes = Arrays.asList(PaymentType.GooglePay,PaymentType.PhonePay,
                                                   PaymentType.CreditCard,PaymentType.DebitCard);

        // now we call the method by passing

        paymentProcessor.PaymentMake(payTypes);

    }
}
