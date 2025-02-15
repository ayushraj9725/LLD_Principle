package LiscovSubstitution_DesignPrinciple.BankingService.ProblematicCode;

import LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode.WithdrawNotFoundException;

import java.math.BigDecimal;

public class FixTermDepositAccount extends Account {


    public FixTermDepositAccount( String details) {
        super(details);
    }

    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Deposit Some Fix Amount in the FixTerm Deposit Account ");
    }

    @Override
    protected void withdraw(BigDecimal amount) throws WithdrawNotFoundException {
        throw new WithdrawNotFoundException("Withdraw is not supported in the FixTerm Deposit Account ");
    }


    @Override
    protected void createAccount(String Details) {

    }
}
