
package xmmaxminfivenumber;

import java.util.Arrays;
import java.util.Scanner;



public class XmMaxMinFiveNumber {

  
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Limit.");
        int size = s.nextInt();

        long [] numbers = new long[size];

        for (int i = 0; i < size; i++) {
            
            System.out.println("Enter Number " + (i + 1));
            long userInput = s.nextInt();
            
            numbers[i] = userInput;
        }
        
        System.out.println("My Numbers Are " + Arrays.toString(numbers)); 

        long maxNumber = numbers[0];
        long minNumber = numbers[0];

        for (long number : numbers) {

            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }

        }

        System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);

    }

    
}