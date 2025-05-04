
package banksysten.supper;

public class Account {
    private long accountNumber;
    private double balance;

    public Account() {
    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", balance=" + balance + '}';
    }
    
    public void accountDetails(){
    
        System.out.println( "AccountNumber" + "  : " + accountNumber + "\n"+ "Balance" + "  : "  + balance + "\n");
        
    }
    public void deposit(){
    
        System.out.println("Deposite"+ "  : " + (balance+balance));
    }
}
