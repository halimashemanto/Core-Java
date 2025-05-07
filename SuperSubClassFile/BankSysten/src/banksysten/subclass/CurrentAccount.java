package banksysten.subclass;

import banksysten.supper.Account;

public class CurrentAccount extends Account {

    private double overDraftLimit;

    public CurrentAccount() {
    }

    public CurrentAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public CurrentAccount(double overDraftLimit, long accountNumber, double balance) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" + "overDraftLimit=" + overDraftLimit + '}';
    }

    @Override
    public void accountDetails() {
        super.accountDetails();

        System.out.println("overDraftLimit" + "  : " + overDraftLimit + "\n" + "Withdraw" + "  : " + (super.getBalance() - overDraftLimit));
    }

    @Override
    public void printDetails() {
        super.printDetails();

        System.out.println("Overdraft Limit: $" + overDraftLimit);

    }

}
