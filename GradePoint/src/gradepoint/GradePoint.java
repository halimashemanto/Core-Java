
package gradepoint;

import java.util.Scanner;


public class GradePoint {

   
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Please Enter Your Mark.");
        float grade = s.nextFloat();
        
        
        if (grade >= 101) {
            System.out.println("Invalid.");

        }
       
           else if (grade >=90) {
            System.out.println("Grade 'A'.");

        }
           else if (grade >=80) {
            System.out.println("Grade 'B'.");
 
        }
           else if (grade >= 70) {
            System.out.println("Grade 'C'.");

        }
            else if (grade >= 60) {
            System.out.println("Grade 'D'.");
            
        }
         
        else {
            System.out.println("Fail 'F'");

        }
        
        
    }
    
}
