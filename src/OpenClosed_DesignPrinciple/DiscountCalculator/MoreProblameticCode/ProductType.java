package OpenClosed_DesignPrinciple.DiscountCalculator.MoreProblameticCode;

public enum ProductType {

    Electronics ,

    Cloths ,

    Shoes ,

    Books ;

    public static double ElectronicsDiscount(double price){
         return price * 0.10 ; // 10% discount
    }

    public static double ClothsDiscount(double price){
        return price * .20 ; // 20% discount
    }

    public static double ShoesDiscount(double price){
        return price * 0.30 ; // 30% Discount
    }

    public static double BooksDiscount(double price){
        return price * 0.40 ; // 40% Discount
    }
}
