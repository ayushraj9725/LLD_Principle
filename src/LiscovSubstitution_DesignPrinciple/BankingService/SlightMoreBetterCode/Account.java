package LiscovSubstitution_DesignPrinciple.BankingService.SlightMoreBetterCode;

import java.math.BigDecimal;
/// it is better but not making sense more because of interface and abstract classes both are coming together, but
///  we will improve it in 4th Interface aggression  Design Principle

public abstract class Account {

    protected String details ;

    public Account(String details) {
        this.details = details ;
    }

    protected abstract void deposit(BigDecimal amount);

    protected abstract void createAccount(String Details);

    protected abstract void withdraw(BigDecimal amount);

}
