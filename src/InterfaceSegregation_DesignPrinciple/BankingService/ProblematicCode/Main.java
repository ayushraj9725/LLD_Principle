package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a FixedTermDepositAccount
            Account fixedTermAccount = new FixedTermDepositAccount();
            BankingAppService fixedTermService = new BankingAppService(fixedTermAccount);
            fixedTermService.createAccount("Fixed Term Account Details");
            fixedTermService.deposit(new BigDecimal("1000.00"));

            // Try to withdraw from FixedTermDepositAccount (not supported)
            fixedTermService.withdraw(new BigDecimal("200.00")); // This will throw an exception

        } catch (WithdrawNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Create a SavingsAccount
            Account savingsAccount = new SavingsAccount();
            BankingAppService savingsService = new BankingAppService(savingsAccount);
            savingsService.createAccount("Savings Account Details");
            savingsService.deposit(new BigDecimal("500.00"));

            // Withdraw from SavingsAccount (supported)
            savingsService.withdraw(new BigDecimal("200.00"));

        } catch (WithdrawNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
