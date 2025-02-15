package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

import java.math.BigDecimal;

public interface WithdrawalAccount extends Account {
    void withdraw(BigDecimal amount) throws WithdrawNotFoundException;
}
