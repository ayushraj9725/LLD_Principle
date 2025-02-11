package OpenClosed_DesignPrinciple.DiscountCalculator.MoreProblameticCode;

public class DiscountManager {

    public void DiscountCalculate(Product product){

        if(product.getType() == ProductType.Electronics){
               double price = product.getPrice() ;
               ProductType.ElectronicsDiscount(price);
        }
        else if(product.getType() == ProductType.Books){
               double price = product.getPrice();
               ProductType.BooksDiscount(price);
        }
        else if(product.getType() == ProductType.Cloths){
               double price = product.getPrice();
               ProductType.ClothsDiscount(price);
        }
        else if(product.getType() == ProductType.Shoes){
               double price = product.getPrice();
               ProductType.ShoesDiscount(price);
        }
        else {
            System.out.println(" Invalid Discount We can add now diff product and calculate ");
        }
        //....... so on
    }
}
