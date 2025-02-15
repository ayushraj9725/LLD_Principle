package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

public class WithdrawNotFoundException extends Exception {
    public WithdrawNotFoundException(String message) {
        super(message);
    }
}