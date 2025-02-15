package InterfaceSegregation_DesignPrinciple.BankingService.BetterCode;


import java.math.BigDecimal;

// FixedTermDepositAccount supports account creation and deposits
public class FixedTermDepositAccount implements AccountCreation, Depositable {
    @Override
    public void createAccount(String details) {
        System.out.println("Fixed Term Deposit Account created: " + details);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Deposited " + amount + " into Fixed Term Deposit Account.");
    }
}

