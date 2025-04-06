
package evenoroddnumber;

import java.util.Scanner;


public class EvenOrOddNumber {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please Enter Your Mark.");
        float grade = s.nextFloat();
        
     //1st if holo parent if    
        if (grade >= 101) {
            System.out.println("Invalid.");

        }
        // ei if gulo sob parent if er child if
            if (grade >=90) {
            System.out.println("Grade 'A'.");

        }
            if (grade >=80) {
            System.out.println("Grade 'B'.");
 
        }
            if (grade >= 70) {
            System.out.println("Grade 'C'.");

        }
            if (grade >= 60) {
            System.out.println("Grade 'D'.");
            
        }
  //ei else holo parent if er else          
        else {
            System.out.println("Fail 'F'");

        }
     
    }
    
}
