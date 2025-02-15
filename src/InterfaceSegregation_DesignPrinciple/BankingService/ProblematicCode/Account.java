package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

import java.math.BigDecimal;

public interface Account {

    void createAccount(String details);
    void deposit(BigDecimal amount);
}

