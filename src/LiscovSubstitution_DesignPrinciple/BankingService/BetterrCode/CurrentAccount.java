package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

public class CurrentAccount extends WithdrawalAccount {


    public CurrentAccount(String details) {
        super(details);
    }

    @Override
    protected void Withdraw(BigDecimal amount) {
        System.out.println("Withdraw Some Amount From the Current Account");
    }

    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Deposit Some Amount In the Current Account");
    }


    @Override
    protected void createAccount(String Details) {
        System.out.println("Open the Current Account ");
    }

}
