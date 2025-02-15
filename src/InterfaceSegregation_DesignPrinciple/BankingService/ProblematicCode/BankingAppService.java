package InterfaceSegregation_DesignPrinciple.BankingService.ProblematicCode;

import java.math.BigDecimal;
// Refactor the BankingAppService to depend on the Account interface and handle withdrawals only if the account supports it:

public class BankingAppService {
    private final Account account;

    public BankingAppService(Account account) {
        this.account = account;
    }

    public void createAccount(String details) {
        account.createAccount(details);
    }

    public void deposit(BigDecimal amount) {
        account.deposit(amount);
    }

    public void withdraw(BigDecimal amount) throws WithdrawNotFoundException {
        if (account instanceof WithdrawalAccount) {
            ((WithdrawalAccount) account).withdraw(amount);
        } else {
            throw new WithdrawNotFoundException("Withdrawals are not supported for this account type.");
        }
    }


}
