package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

import java.math.BigDecimal;

public class FixedTermDepositAccount implements Account{

    @Override
    public void createAccount(String details) {
        System.out.println("Fixed Term Deposit Account created: " + details);
    }

    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("Deposited " + amount + " into Fixed Term Deposit Account.");
    }


}
