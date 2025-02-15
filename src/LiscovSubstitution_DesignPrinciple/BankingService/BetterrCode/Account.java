package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

public abstract class Account {

    protected String details ;

    public Account(String details) {
        this.details = details ;
    }

    protected abstract void deposit(BigDecimal amount);

    protected abstract void createAccount(String Details);


}
