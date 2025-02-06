package OpenClosed_DesignPrinciple.Payment_Processor.ProblemMaticCode;

import OpenClosed_DesignPrinciple.Payment_Processor.BetterCodee.Payment;

import java.util.List;

public class PaymentProcessor {


    public void PaymentMake(List<PaymentType> PaymentMethod){

        for(PaymentType type : PaymentMethod){
            if(type == PaymentType.DebitCard){
                type.payWithDebitCard();
            }
            else if(type == PaymentType.CreditCard){
                type.payWithCreditCard();
            }
            else if(type == PaymentType.GooglePay){
                type.payWithGooglePAy();
            }
            else if(type == PaymentType.PhonePay){
                type.payWithPhonePay();
            }
            // if any method make we can perform using this by providing condition over here


        }

    }
}
