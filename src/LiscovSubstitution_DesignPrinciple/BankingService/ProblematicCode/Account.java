package LiscovSubstitution_DesignPrinciple.BankingService.ProblematicCode;

import LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode.WithdrawNotFoundException;

import java.math.BigDecimal;

public abstract class Account {
    private String details ;

    public Account(String details) {
        this.details = details ;
    }

    protected abstract void deposit(BigDecimal amount);

    protected abstract void withdraw(BigDecimal amount) throws WithdrawNotFoundException;

    protected abstract void createAccount(String Details);

}
