
package banksysten;

import banksysten.subclass.CurrentAccount;
import banksysten.subclass.SavingsAccount;


public class BankSysten {

   
    public static void main(String[] args) {
       
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();
        
        sa.setAccountNumber(123456);
        sa.setBalance(50000);
        sa.setInterestRate(.05);
        sa.accountDetails();
        sa.deposit();
        
        System.out.println("------");
        
        ca.setAccountNumber(987456);
        ca.setBalance(200000);
        ca.setOverDraftLimit(300000);
        
        ca.accountDetails();
        ca.deposit();
    }
    
}
