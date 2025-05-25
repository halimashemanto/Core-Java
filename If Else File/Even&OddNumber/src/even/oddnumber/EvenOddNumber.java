package even.oddnumber;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter Number for Checking iS iT Even or Odd.");

        long userInput = s.nextLong();

        if (userInput % 2 == 0) {

            System.out.println("Even Number");
        } 
        
        else {
            
            System.out.println("odd Number");

        }

    }
}
