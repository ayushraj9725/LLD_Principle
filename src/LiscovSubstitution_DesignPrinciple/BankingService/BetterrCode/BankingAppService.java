package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

// To escape from the tight coupling we need to make the withdrawal banking service

public class BankingAppService {
    protected Account account ;

    public BankingAppService(Account account) {
        this.account = account;
    }


    public void CreateAccount(String Details){
        account.createAccount(Details);
    }

    public void Deposit(BigDecimal amount){
        account.deposit(amount);
    }

}
