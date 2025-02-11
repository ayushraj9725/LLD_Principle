package OpenClosed_DesignPrinciple.VehicleInsuranceEvaluator.BetterCode;

public class Car extends Vehicle {

//
//    public Car(double premium, String details) {
//        super(premium, details);
//    }

    public InsuranceQuote calculateInsuranceQuote() {
        // Specific logic for car insurance
        return new InsuranceQuote(500, "Car Insurance Premium");
    }

}
