package OpenClosed_DesignPrinciple.DiscountCalculator.BetterCodee;

public class Product {
    DiscountManager discountManager;
    double price ;

    public Product(DiscountManager discountManager , double price ) {
        this.discountManager = discountManager;
        this.price = price ;
    }

    public DiscountManager getDiscountManager() {
        return discountManager;
    }

    public void setDiscountManager(DiscountManager discountManager) {
        this.discountManager = discountManager;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
