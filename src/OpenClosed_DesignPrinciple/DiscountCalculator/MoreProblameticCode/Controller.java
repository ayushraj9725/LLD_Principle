package OpenClosed_DesignPrinciple.DiscountCalculator.MoreProblameticCode;

public class Controller {
    public static void main(String[] args) {

        // Create a product instance
        Product product = new Product();

        // Set the product type
        product.setType(ProductType.Electronics);

        // Set the price based on the product type
        switch (product.getType()) {
            case Electronics:
                product.setPrice(25000);
                break;
            case Books:
                product.setPrice(500);
                break;
            case Cloths:
                product.setPrice(10000);
                break;
            case Shoes:
                product.setPrice(8000);
                break;
            default:
                System.out.println("Invalid product type");
                return;
        }

        // Create an instance of DiscountManager
        DiscountManager discountManager = new DiscountManager();

        // Calculate the discount
        discountManager.DiscountCalculate(product);

        // Display the original and discounted price
        double originalPrice = product.getPrice();
        double discountedPrice = originalPrice - getDiscountedPrice(product);

        System.out.println("Original Price: " + originalPrice);
        System.out.println("Discounted Price: " + discountedPrice);
    }

    // Helper method to get the discounted price based on product type
    private static double getDiscountedPrice(Product product) {
        switch (product.getType()) {
            case Electronics:
                return ProductType.ElectronicsDiscount(product.getPrice());
            case Books:
                return ProductType.BooksDiscount(product.getPrice());
            case Cloths:
                return ProductType.ClothsDiscount(product.getPrice());
            case Shoes:
                return ProductType.ShoesDiscount(product.getPrice());
            default:
                return 0;
        }


//        Product product = new Product();
//
//        // setting the product type
//
//        product.setType(ProductType.Electronics);
//
//        if(product.getType() == ProductType.Electronics) product.setPrice(25000);
//        if(product.getType() == ProductType.Books) product.setPrice(500);
//        if(product.getType() == ProductType.Cloths) product.setPrice(10000);


    }
}
