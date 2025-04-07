
package calculatepositivenumber;

import java.util.Scanner;


public class CalculatePositiveNumber {

    public static void main(String[] args) {
       
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter a Number ");
        int num = s.nextInt();
        
        if (num>0) {
            
            System.out.println("Positive number");
        }

            else if( num<0 ) {
                System.out.println(" Negative number");
        }

        else {
            System.out.println("Zero");
        
        }
        
        
    }
    
}
