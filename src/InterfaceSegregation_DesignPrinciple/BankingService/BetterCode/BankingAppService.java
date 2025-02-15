package InterfaceSegregation_DesignPrinciple.BankingService.BetterCode;

import java.math.BigDecimal;

public class BankingAppService {
    private final AccountCreation accountCreation;
    private final Depositable depositable;
    private Withdrawable withdrawable;

    public BankingAppService(AccountCreation accountCreation, Depositable depositable) {
        this.accountCreation = accountCreation;
        this.depositable = depositable;
    }

    public BankingAppService(AccountCreation accountCreation, Depositable depositable, Withdrawable withdrawable) {
        this.accountCreation = accountCreation;
        this.depositable = depositable;
        this.withdrawable = withdrawable;
    }

    public void createAccount(String details) {
        accountCreation.createAccount(details);
    }

    public void deposit(BigDecimal amount) {
        depositable.deposit(amount);
    }

    public void withdraw(BigDecimal amount) throws WithdrawNotFoundException {
        if (withdrawable != null) {
            withdrawable.withdraw(amount);
        } else {
            throw new WithdrawNotFoundException("Withdrawals are not supported for this account type.");
        }
    }
}
