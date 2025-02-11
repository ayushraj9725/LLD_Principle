package OpenClosed_DesignPrinciple.DiscountCalculator.BetterCodee;

public class DiscountCalculatorService {
    DiscountManager discountManager ; // never use yet
    Product product ;

    public double discountCalculate(DiscountManager discountManager,Product product){
         return discountManager.discountCalculate(product.getPrice());
    }

}
