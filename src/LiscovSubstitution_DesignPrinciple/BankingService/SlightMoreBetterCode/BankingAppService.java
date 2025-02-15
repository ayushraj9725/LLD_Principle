package LiscovSubstitution_DesignPrinciple.BankingService.SlightMoreBetterCode;


// To escape from the tight coupling we need to make the withdrawal banking service

import LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode.FixTermDepositAccount;

import java.math.BigDecimal;

public class BankingAppService  {
    protected Account account ;
    protected FiXTermDepositAccount fiXTermDepositAccount ;

    public BankingAppService(Account account) {
        this.account = account;
    }

    public BankingAppService(FiXTermDepositAccount fiXTermDepositAccount) {
        this.fiXTermDepositAccount = fiXTermDepositAccount;
    }

    public  void Withdraw(BigDecimal amount){
        account.withdraw(amount);
    }

    public void CreateAccount(String Details){
        account.createAccount(Details);
    }

    public void Deposit(BigDecimal amount){
        account.deposit(amount);
    }

    public void OpenAccount(String Details){
        fiXTermDepositAccount.OpenAccount(Details);
    }

    public void DepositInFix(BigDecimal amount){
        fiXTermDepositAccount.Deposit(amount);
    }

}
