
package guessnumberthreetime;

import java.util.Scanner;


public class GuessNumberThreeTime {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int userGuess = s.nextInt();
        
        int computer = (int) (Math.random()*100);
        
        int count = 1;
        
        while(count <3){
            
            if(computer == userGuess){
               System.out.println("Congratulations !! You Win.");
               break;
            }
            else if(computer < userGuess){
             System.out.println("Your Guess Number is High from Random guess.");
              System.out.println("Again enter a number.");
               userGuess = s.nextInt();
            }
              else if(computer > userGuess){
             System.out.println("Your Guess Number is Low from Random guess.");
              System.out.println("Again enter a number.");
               userGuess = s.nextInt();
            }
             if(count == 2){
              System.out.println("We are Very SORRY!!.");
            }
            
           count++;
            
            
        }

         
    }
    
}
