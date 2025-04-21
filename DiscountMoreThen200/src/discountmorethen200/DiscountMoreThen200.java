
package discountmorethen200;

import java.util.Scanner;


public class DiscountMoreThen200 {

 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Price .");
        double userInput = s.nextDouble();

        if(userInput >= 0 && userInput <= 200){
        
            System.out.println(userInput + " is not a discount amount. So, you miss this chance." + "\n"
            + "Your total amount is " + userInput );
         }
        else if(userInput > 200){
        
            System.out.println(userInput + " is more than 200. So, you get discount." + "\n"
                    + "Discount Amount is "+(userInput*.05)+"\n"
                            + "Total amount is " + (userInput-(userInput*.05)));
        }
        else if(userInput < 0){
            System.out.println("Nagetive price is not allowed.");
        }
        
    }
    
}
