package arraymaxminfivenumber;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMinFiveNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Limit.");
        int size = s.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Number " + (i + 1));
            int userInput = s.nextInt();
            numbers[i] = userInput;
        }
        System.out.println("My Numbers Are " + Arrays.toString(numbers));

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int number : numbers) {

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


