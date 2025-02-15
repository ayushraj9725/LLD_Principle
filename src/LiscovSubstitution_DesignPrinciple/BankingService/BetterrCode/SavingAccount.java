package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

public class SavingAccount extends WithdrawalAccount {

    public SavingAccount(String details) {
        super(details);
    }

    @Override
    protected void Withdraw(BigDecimal amount) {
        System.out.println("Withdraw Some Amount From the Saving Account");
    }

    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Deposit Some Amount In the Saving Account");
    }

    @Override
    protected void createAccount(String Details) {
        System.out.println("Open the Saving Account ");
    }


}
