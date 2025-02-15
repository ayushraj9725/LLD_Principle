package InterfaceSegregation_DesignPrinciple.BankingService.BetterCode;

import java.math.BigDecimal;

// SavingsAccount supports account creation, deposits, and withdrawals
public class CurrentAccount implements AccountCreation, Depositable, Withdrawable {
    @Override
    public void createAccount(String details) {
        System.out.println("currents Account created: " + details);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Deposited " + amount + " into current Account.");
    }

    @Override
    public void withdraw(BigDecimal amount) throws WithdrawNotFoundException {
        System.out.println("Withdrew " + amount + " from current Account.");
    }
}
