package InterfaceSegregation_DesignPrinciple.BankingService.BetterCode;

import java.math.BigDecimal;
// Interface for withdrawing funds

public interface Withdrawable {
    void withdraw(BigDecimal amount) throws WithdrawNotFoundException;
}
