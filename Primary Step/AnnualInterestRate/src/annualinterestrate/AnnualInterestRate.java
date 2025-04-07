package annualinterestrate;

import java.util.Scanner;

public class AnnualInterestRate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter Interest Rate.");
        double interestRate = s.nextDouble();
        double monthlyInterestRates = interestRate / 1200;

        System.out.println("enter number of year");
        int numberOfYear = s.nextInt();

        System.out.println("Enter Loan Amount");
        double loanAmount = s.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRates / (1 - 1 / Math.pow(1 + monthlyInterestRates, numberOfYear * 12));
        double totalPayment = monthlyPayment * numberOfYear * 12;

        //System.out.println("Total monthly payment is TK = " + monthlyPayment);
        //System.out.println("Total Payment is TK = " + totalPayment);
        System.out.println("Total monthly payment is TK = " + (int) monthlyPayment);
        System.out.println("Total Payment is TK = " + (int) totalPayment);

    }

}
