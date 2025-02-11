package OpenClosed_DesignPrinciple.DiscountCalculator.BetterCodee;

public class Books implements DiscountManager{

    @Override
    public double discountCalculate(double price) {
        return price * 0.30 ; // give discount
    }
}
