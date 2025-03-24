
package javaapplication2;

import java.util.Scanner;


public class JavaApplication2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st number ");
        int num1 = input.nextInt();
        
           System.out.println("Enter 2nd number "); 
           int num2 = input.nextInt();
           
         //  int result = num1 + num2;
         
         float result = (float) num1 / num2; 
           
           System.out.println("Result is " + result);
           
           
        
        
    }
    
}
