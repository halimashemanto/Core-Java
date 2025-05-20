
package fexceptionhandler;

import java.util.Scanner;

public class FExceptionHandler {

   

   
 
    public static void main(String[] args) {
        
        try{
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter 1st number.");
        int input1 = s.nextInt();
        
         System.out.println("enter 2nd number.");
        int input2 = s.nextInt();
        
        int result = input1/input2;
        System.out.println(result);
        
        }
        catch(Exception e){
        
            System.out.println(e);
        }
}
    
}
