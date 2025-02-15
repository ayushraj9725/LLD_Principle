package InterfaceSegregation_DesignPrinciple.BankingService.BetterCode;

import java.math.BigDecimal;

// SavingsAccount supports account creation, deposits, and withdrawals
public class SavingsAccount implements AccountCreation, Depositable, Withdrawable {
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