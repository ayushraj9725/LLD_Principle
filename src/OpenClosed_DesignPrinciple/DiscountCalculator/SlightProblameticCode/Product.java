package OpenClosed_DesignPrinciple.DiscountCalculator.SlightProblameticCode;

public class Product {
    ProductType type;
    double price ;

    public Product(ProductType type , double price) {
        this.type = type;
        this.price = price ;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
