package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // test ing the classes object

        WithdrawalAccount AccountSaving = new SavingAccount("Details");
        WithdrawalAccount AccountCurrent = new CurrentAccount("Details");

        Account fixTermDepositAccount = new FixTermDepositAccount("Details");


        BankingAppService bankingAppService = new BankingAppService(AccountSaving); // ""
        BankingWithdrawalService bankingWithdrawalService =  new BankingWithdrawalService(AccountSaving); // :
        BankingWithdrawalService bankingWithdrawalService1 = new BankingWithdrawalService(AccountCurrent); // ;

        BankingAppService bankingAppService2 = new BankingAppService(fixTermDepositAccount);  // ;;

        // now lets Call the Methods

        bankingAppService.CreateAccount("Name , Aadhaar , Adders "); // ""
        bankingWithdrawalService.Withdraw(new BigDecimal(2983938)); // :
        bankingWithdrawalService1.Withdraw(new BigDecimal(8982903)); // ;

        bankingAppService2.Deposit(new BigDecimal(100000000)); // ;;

    }
}
