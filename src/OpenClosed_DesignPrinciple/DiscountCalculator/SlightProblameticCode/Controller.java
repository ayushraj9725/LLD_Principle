package OpenClosed_DesignPrinciple.DiscountCalculator.SlightProblameticCode;

public class Controller {
    public static void main(String[] args) {

        Product electronics = new Product(ProductType.Electronics,10000);
        Product books = new Product(ProductType.Books,1000);
        Product cloths = new Product(ProductType.Cloths,2500);

        DiscountManager discountManager = new DiscountManager();

        double electronics_discount = discountManager.DiscountCalculate(electronics); // Electronics Products Discount Calculated
        double book_discount = discountManager.DiscountCalculate(books);  // Books discount Calculated
        double cloths_discount = discountManager.DiscountCalculate(cloths); // Cloths Discount Calculated

        System.out.println("Original Price of Electronics: "+electronics.getPrice());
        System.out.println("Discounted Price of Electronics : "+(electronics.getPrice() - electronics_discount));

        System.out.println("Original Price of Books: "+books.getPrice());
        System.out.println("Discounted Price of Books : "+(books.getPrice() - book_discount));

        System.out.println("Original Price of Cloths: "+cloths.getPrice());
        System.out.println("Discounted Price of Cloths : "+(cloths.getPrice() - cloths_discount));
    }
}
