package LiscovSubstitution_DesignPrinciple.BankingService.ProblematicCode;

import LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode.WithdrawNotFoundException;

import java.math.BigDecimal;

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

    public void Withdraw(BigDecimal amount) throws WithdrawNotFoundException {
        account.withdraw(amount);
    }

    /* this is unusually things which violating the principle that mean we are doing wrong thing over here that to write below
    *  there is fixTermDeposit Account which not support withdraw, and we are extending that using inheritance use super type is subtype
    *  in unwanted way , so that thing we have to fix be substituting the subtype behaviour from subclasses and make the loose coupling btw in classes
    *
    *  If any things not relay we don't do that instead of in expected way , so we fix it in the better code using liskov substitution Design Principle !
    *
    */

}
