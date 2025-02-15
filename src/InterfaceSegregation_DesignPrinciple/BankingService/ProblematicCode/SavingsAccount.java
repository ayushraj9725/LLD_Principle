package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

import java.math.BigDecimal;

public class SavingsAccount implements  WithdrawalAccount{
    @Override
    public void createAccount(String details) {
        System.out.println("Savings Account created: " + details);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Deposited " + amount + " into Savings Account.");
    }

    @Override
    public void withdraw(BigDecimal amount) throws WithdrawNotFoundException {
        System.out.println("Withdrew " + amount + " from Savings Account.");
    }


}
