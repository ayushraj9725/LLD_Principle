package LiscovSubstitution_DesignPrinciple.BankingService.SlightMoreBetterCode;

import java.math.BigDecimal;

public class FixDepositAccount implements FiXTermDepositAccount{

    @Override
    public void Deposit(BigDecimal amount) {
        System.out.println("Amount "+ amount + " Deposit in the Fix Deposit Account ");
    }

    @Override
    public void OpenAccount(String Details) {
        System.out.println("Open the Fix Term Deposit Account ");
    }
}
