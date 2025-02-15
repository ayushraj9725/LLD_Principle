package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

import java.math.BigDecimal;

public class CurrentAccount implements  WithdrawalAccount{

    @Override
    public void createAccount(String details) {
        System.out.println("Current Account created: " + details);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Deposited " + amount + " into Current Account.");
    }

    @Override
    public void withdraw(BigDecimal amount) throws WithdrawNotFoundException {
        System.out.println("Withdrew " + amount + " from current Account.");
    }
}
