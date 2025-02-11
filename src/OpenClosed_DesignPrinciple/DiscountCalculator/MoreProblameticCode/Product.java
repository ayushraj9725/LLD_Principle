package OpenClosed_DesignPrinciple.DiscountCalculator.MoreProblameticCode;

public class Product {
    ProductType type ;
    double price ;

    void setPrice(double price){
        this.price = price ;
    }

    double getPrice(){
        return price ;
    }

    void setType(ProductType type){
        this.type = type ;
    }

    ProductType getType(){
        return type ;
    }

}
