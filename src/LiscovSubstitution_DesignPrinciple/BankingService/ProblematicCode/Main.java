package LiscovSubstitution_DesignPrinciple.BankingService.ProblematicCode;

import LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode.WithdrawNotFoundException;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws WithdrawNotFoundException {

        // we are making the Instance variable of the Base Account class which point to the Subclasses

        Account currentAccount = new CurrentAccount("Details");
        Account savingAccount = new SavingAccount( "Details");
        Account fixTermDepositAccount = new FixTermDepositAccount( "Details");

        BankingAppService bankingAppService = new BankingAppService(currentAccount);
        BankingAppService bankingAppService1 = new BankingAppService(savingAccount);
        BankingAppService bankingAppService2 = new BankingAppService(fixTermDepositAccount);

        // now we call the method by taking some value
        bankingAppService.Deposit(BigDecimal.valueOf(293788929.00));
        bankingAppService1.Withdraw(BigDecimal.valueOf(8398392.09));

        try {
            bankingAppService2.Withdraw(new BigDecimal("100.00")); // This will throw the exception
        } catch (WithdrawNotFoundException e) {
            System.out.println("Error: " + e.getMessage()); // Print the exception message
        }


    }
}
