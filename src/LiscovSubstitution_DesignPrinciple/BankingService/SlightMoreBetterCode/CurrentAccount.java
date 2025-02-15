package LiscovSubstitution_DesignPrinciple.BankingService.SlightMoreBetterCode;


import java.math.BigDecimal;

public class CurrentAccount extends Account {


    public CurrentAccount(String details) {
        super(details);
    }


    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Deposit "+amount + " Amount In the Current Account");
    }

    @Override
    protected void createAccount(String Details) {
        System.out.println("Open the Current Account ");
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        System.out.println("Withdraw " + amount + " from Current Account ");
    }


}
