package LiscovSubstitution_DesignPrinciple.BankingService.SlightMoreBetterCode;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Account savingAccount = new SavingAccount("Details");
        BankingAppService bankingAppService = new BankingAppService(savingAccount);

        bankingAppService.CreateAccount("Name , Aadhaar , Address");
        bankingAppService.Deposit(new BigDecimal(283938));
        bankingAppService.Withdraw(new BigDecimal(3647836));

        System.out.println("*******<>********<>******<>*********<>*******");

        // current Account
        Account currentAccount = new CurrentAccount("Details");
        BankingAppService bankingAppService1 = new BankingAppService(currentAccount);

        bankingAppService1.CreateAccount("Name , Aadhaar , Address");
        bankingAppService1.Deposit(new BigDecimal(28391238));
        bankingAppService1.Withdraw(new BigDecimal(337822336));

        System.out.println("*******<>********<>******<>*********<>*******");

        // fixDeposit Account : we can achieve that using any saving or current account
        FiXTermDepositAccount fiXTermDepositAccount = new FixDepositAccount();
        BankingAppService bankingAppService2 = new BankingAppService(fiXTermDepositAccount);

        bankingAppService2.OpenAccount("Name , Aadhaar , Address");
        bankingAppService2.DepositInFix(new BigDecimal(70000000));


    }
}
