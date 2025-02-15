package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

public abstract class WithdrawalAccount extends Account {

     // This abstract class is inheriting the Account class take method of deposit and create , but it has own abstract method that is withdrawal !
     // which will implementing in the current and saving account

    public WithdrawalAccount(String details) {
        super(details);
    }

    protected abstract void Withdraw(BigDecimal amount) throws WithdrawNotFoundException; ;


}
