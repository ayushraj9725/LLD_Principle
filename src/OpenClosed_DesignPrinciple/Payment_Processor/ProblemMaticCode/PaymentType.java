package OpenClosed_DesignPrinciple.Payment_Processor.ProblemMaticCode;

public enum PaymentType {
    CreditCard ,
    DebitCard ,
    PhonePay ,
    GooglePay ;

    public void payWithCreditCard(){
        System.out.println("Payment Processing With Credit card !");
    }

    public void payWithDebitCard(){
        System.out.println("Payment Processing with Debit Card !");
    }

    public void payWithPhonePay(){
        System.out.println("Payment Processing with Phone Pay !");
    }

    public void payWithGooglePAy(){
        System.out.println("Payment processing with Google Pay !");
    }


}
