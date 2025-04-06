
package findoutmanytoonelargestnumber;

import java.util.Scanner;


public class FindoutManyToOneLargestNumber {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number");
          float num=s.nextFloat();
        
        System.out.println("Enter 2nd number");
        
        float num1 =s.nextFloat();
      
        
        if(num>=num1){
            
            System.out.println("Largest Number is " + num);
        }
        else {
         System.out.println("Largest Number is " + num1);

        }
    }
    
}
