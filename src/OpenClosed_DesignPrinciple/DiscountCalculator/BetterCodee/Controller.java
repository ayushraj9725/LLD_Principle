package OpenClosed_DesignPrinciple.DiscountCalculator.BetterCodee;

public class Controller {
    public static void main(String[] args) {

        // Create instance variable of DiscountManager which provide the dependencies
        DiscountManager electronics_discount = new Electronics();
        DiscountManager cloths_discount = new Cloths();
        DiscountManager books_discount = new Books();

        // create the instance of product whatever product we want to give and se calculated discount by giving some price

        Product electronics_products = new Product(electronics_discount,10000);
        Product cloths_products = new Product(cloths_discount,1000);
        Product books_products = new Product(books_discount,2500);

        // now we have to call the discountCalculatorServices methods
        DiscountCalculatorService discountCalculatorService = new DiscountCalculatorService();

        double electronics_discount_price = discountCalculatorService.discountCalculate(electronics_discount,electronics_products);
        double cloths_discount_price = discountCalculatorService.discountCalculate(cloths_discount,cloths_products);
        double book_discount_price = discountCalculatorService.discountCalculate(books_discount,books_products);

        // now we have to print the original product price and discounted price
        double electronics_discounted_price = electronics_products.getPrice() - electronics_discount_price ;
        double cloths_discounted_price = cloths_products.getPrice() - cloths_discount_price ;
        double books_discounted_price = books_products.getPrice() - book_discount_price ;

        System.out.println("Original Price of Electronics Products : "+electronics_products.getPrice());
        System.out.println("DisCounted Price of Electronics Products : "+electronics_discounted_price);

        System.out.println("Original Price of Cloths Products : "+cloths_products.getPrice());
        System.out.println("DisCounted Price of Cloths Products : "+cloths_discounted_price);

        System.out.println("Original Price of Books Products : "+books_products.getPrice());
        System.out.println("DisCounted Price of Books Products : "+books_discounted_price);

    }
}
