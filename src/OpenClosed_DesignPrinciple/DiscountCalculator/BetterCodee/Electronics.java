package OpenClosed_DesignPrinciple.DiscountCalculator.BetterCodee;

public class Electronics implements DiscountManager{

    public double discountCalculate(double price){
        return price * 0.10 ; // whatever % we want to get we can update this
    }
}
