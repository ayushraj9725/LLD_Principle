package LiscovSubstitution_DesignPrinciple.CreditCardPayment.BetterCode;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create an instance of InternationalPaymentCompatibleCreditCard
        InternationalPaymentCompatibleCreditCard internationalCard = new MasterCard();

        // Create a list to hold the cards
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        cards.add(internationalCard);

        // Iterate through the list and call the internationalPayment method
        for (InternationalPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }


        // The problem over here with the code reusability during the inheritance and abstract class there is some violation is happening design principle
        // that is the unnecessary thing we are doing in the class which should not fit any individual method or behaviour that is abstract for all so
        // there is credit card abstract behaviour UpiPayment and internationalPayment both which does not support all the credit card for the all
        // UpiPayment only support the RupPayCard so it require to implement this behaviour here but InternationalPayment does not support this behaviour so it should not implement there
        // same thing happened with the MasterCard It only support the IntlPayment while not support UpiPayment so here the violation create ,
        // if anything not should require to include anywhere than why we put that thing over there we simply replicate that thing from there and fit in other way
        // here comes thins principle we need to substitute something from the base class and specified with other way to make diff base then we can only achieve what we want and do only
        // tight coupling during the inheritance avoid here to do this with real life example
        // that above Violation we are removing using the Liskov substitution Design principle
        // to make UPIPayment and InternationalPayment as Interface and we use these , where it require to fit or implement  and simply use it it reduce the coupling and refer loose coupling , increase the efficiency and flexibility
    }
}
