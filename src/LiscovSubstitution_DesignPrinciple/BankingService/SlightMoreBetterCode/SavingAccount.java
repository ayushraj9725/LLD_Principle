package LiscovSubstitution_DesignPrinciple.BankingService.SlightMoreBetterCode;


import java.math.BigDecimal;

public class SavingAccount extends Account  {

    public SavingAccount(String details) {
        super(details);
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        System.out.println("Withdraw "+ amount + " Amount From the Saving Account");
    }

    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Deposit "+ amount +" Amount In the Saving Account");
    }

    @Override
    protected void createAccount(String Details) {
        System.out.println("Open the Saving Account ");
    }

}
