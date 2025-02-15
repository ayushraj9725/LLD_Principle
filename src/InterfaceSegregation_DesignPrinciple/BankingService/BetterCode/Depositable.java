package InterfaceSegregation_DesignPrinciple.BankingService.BetterCode;

import java.math.BigDecimal;
// Interface for depositing funds

public interface Depositable {
    void deposit(BigDecimal amount);

}
