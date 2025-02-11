package OpenClosed_DesignPrinciple.DiscountCalculator.BetterCodee;

public class Cloths implements DiscountManager{

    @Override
    public double discountCalculate(double price) {
        return price * 0.20 ; // 20 % Discount
    }

}
