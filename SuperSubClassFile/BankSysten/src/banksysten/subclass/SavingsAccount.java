
package banksysten.subclass;

import banksysten.supper.Account;


public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate, long accountNumber, double balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" + "interestRate=" + interestRate + '}';
    }

    @Override
    public void accountDetails() {
        super.accountDetails(); 
        System.out.println("InterestRate"+ "  : "  +interestRate+ "\n");
    }

    @Override
    public void deposit() {
        super.deposit(); 
    }
    
    
}
