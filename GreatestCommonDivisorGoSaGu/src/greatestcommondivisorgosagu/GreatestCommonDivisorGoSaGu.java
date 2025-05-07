
package greatestcommondivisorgosagu;

import java.util.Scanner;


public class GreatestCommonDivisorGoSaGu {

  
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st Number.");
        int input1 = s.nextInt();
        
          System.out.println("Enter 1st Number.");
        int input2 = s.nextInt(); 
        
        System.out.println("The Greatest Common Divisor for " +input1 + " & " + input2 + " is " + GCD(input1,input2) + ".");
        
    }
    
   
    public static int GCD(int input1, int input2){
        
        int gcd = 1;
        if(input1 % input2 == 0)
        
            return input2;
            
            
            for(int i = input2 / 2; i >=1; i--){
                if(input1 % i== 0 && input2 % i == 0){
                    gcd = i;
                    break;
                }
            }
        
  
        return gcd;
    
    }


}
