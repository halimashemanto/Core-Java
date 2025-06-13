
package dowhileloopmakingfactorial;

import java.util.Scanner;


public class DoWhileLoopMakingFactorial {

    
    public static void main(String[] args) {
        
                Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a Factorial Number");
        int userInput = s.nextInt();
        
        int count = 1;
       long factorial = 1;
        
       if(userInput < 0){
           System.out.println("Any negative number are not allowed");
       }
       else{
           do{
               factorial *=count;
               count++;
           }
           while(count <= userInput);
       }  
        System.out.println("Factorial Number is = " + factorial);
        
    }
    
}
