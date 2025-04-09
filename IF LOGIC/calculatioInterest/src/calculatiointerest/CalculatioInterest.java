package calculatiointerest;

import java.util.Scanner;

public class CalculatioInterest {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Interest Rate.");
        double interestRate = s.nextDouble();
        
        double monthlyInterestRate = interestRate/1200;
        
        
        System.out.println("Enter Number of Year.");
        int numberOfYears =s.nextInt();
        
        
             System.out.println("Enter Loan Amount.");
             double loanAmount = s.nextDouble(); 
             
             double monthlyPayment = loanAmount*monthlyInterestRate/ (1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12 ));
             
             double totalPayment = monthlyPayment* numberOfYears*12;
             
             //System.out.println("The Monthly Payment is TK " + monthlyPayment);
            // System.out.println("The Total Payment is TK " +totalPayment );
             
              System.out.println("The Monthly Payment is TK " + (int)monthlyPayment);
             System.out.println("The Total Payment is TK " + (int)totalPayment );

             
             
    }
    
}
