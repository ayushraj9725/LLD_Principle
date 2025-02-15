package InterfaceSegregation_DesignPrinciple.BankingService.BetterCode;

public class WithdrawNotFoundException extends Exception {
    public WithdrawNotFoundException(String message) {
        super(message);
    }
}
