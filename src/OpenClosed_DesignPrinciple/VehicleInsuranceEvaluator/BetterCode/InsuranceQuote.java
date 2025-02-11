package OpenClosed_DesignPrinciple.VehicleInsuranceEvaluator.BetterCode;

public class InsuranceQuote {
    private double premium;
    private String details;

    public InsuranceQuote(double premium, String details) {
        this.premium = premium;
        this.details = details;
    }

    public double getPremium() {
        return premium;
    }

    public String getDetails() {
        return details;
    }
}
