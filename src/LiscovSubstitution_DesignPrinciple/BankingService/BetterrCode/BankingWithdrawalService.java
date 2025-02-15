package LiscovSubstitution_DesignPrinciple.BankingService.BetterrCode;

import java.math.BigDecimal;

public class BankingWithdrawalService {

    protected WithdrawalAccount withdrawalAccount ;

    public BankingWithdrawalService(WithdrawalAccount withdrawalAccount) {
        this.withdrawalAccount = withdrawalAccount;
    }

    public  void  Withdraw(BigDecimal amount){
        System.out.println("Withdrawal Amount is : "+amount);
    }


}
