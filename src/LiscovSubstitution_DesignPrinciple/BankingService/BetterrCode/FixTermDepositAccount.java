package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

public class FixTermDepositAccount extends Account {


    public FixTermDepositAccount(String details) {
        super(details);
    }

    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Deposit " + amount + " Fix Amount in the FixTerm Deposit Account ");
    }

    @Override
    protected void createAccount(String Details) {
        System.out.println("Open the FixTermDeposit Account ");
    }
}
