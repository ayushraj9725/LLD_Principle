package OpenClosed_DesignPrinciple.VehicleInsuranceEvaluator.BetterCode;

public class Controller {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle bike = new Bike();

        VehicleInsuranceEvaluator evaluator = new VehicleInsuranceEvaluator();

        InsuranceQuote carQuote = evaluator.evaluateInsurance(car);
        System.out.println("Car Insurance: " + carQuote.getDetails() + ", Premium: " + carQuote.getPremium());

        InsuranceQuote truckQuote = evaluator.evaluateInsurance(truck);
        System.out.println("Truck Insurance: " + truckQuote.getDetails() + ", Premium: " + truckQuote.getPremium());

        InsuranceQuote bikeQuote = evaluator.evaluateInsurance(bike);
        System.out.println("Bike Insurance: " + bikeQuote.getDetails() + ", Premium: " + bikeQuote.getPremium());
    }
}
