package methodmakingprimenumber;

import java.util.Scanner;

public class MethodMakingPrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Number. ");
        int input = s.nextInt();

        String result = findPrimeNumber(input);
        System.out.println(result);
    }

    public static String findPrimeNumber(int userInput ) {

        int count = 0;
        String result = "";
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            result = userInput + " is  a prime number.";
        } 
        else {
            result = userInput + " is not a prime number.";
        }

        return result;

    }

}
