package OpenClosed_DesignPrinciple.VehicleInsuranceEvaluator.BetterCode;

public class Truck extends Vehicle{

//    public Truck(double premium , String details){
//        super(premium,details);
//    }  // when we extend the insuranceQuote class then we do this

    public InsuranceQuote calculateInsuranceQuote(){
        return new InsuranceQuote(1200,"Truck Premium Insurance ");
    }
}
