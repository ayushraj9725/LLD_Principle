package OpenClosed_DesignPrinciple.VehicleInsuranceEvaluator.BetterCode;

public class Bike extends Vehicle{

    @Override
    public  InsuranceQuote calculateInsuranceQuote(){
        return new InsuranceQuote(300,"bike Insurance Premium");
    }
}
