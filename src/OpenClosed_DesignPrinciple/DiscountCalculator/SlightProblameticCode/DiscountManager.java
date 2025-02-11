package OpenClosed_DesignPrinciple.DiscountCalculator.SlightProblameticCode;

public class DiscountManager {
    public double DiscountCalculate(Product product){
        if(product.getType() == ProductType.Electronics){
            return product.getPrice() * 0.10 ; // 10% Discount
        }
        else if(product.getType() == ProductType.Cloths){
            return product.getPrice() * 0.20 ; // 20% Discount
        }
        else if(product.getType() == ProductType.Books) {
            return product.getPrice() * 0.30 ; // 30% Discount
        }
        else{
            System.out.println("New thing we can added ");
        }

        return 0 ;
    }
}
