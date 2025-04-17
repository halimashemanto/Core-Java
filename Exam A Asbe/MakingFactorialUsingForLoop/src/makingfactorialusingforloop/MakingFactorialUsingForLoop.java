package makingfactorialusingforloop;

import java.util.Scanner;

public class MakingFactorialUsingForLoop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter A Number");
        long input = s.nextLong();
        long factorial = 1;

        for (int i = 1; i <= input; i++) {

            factorial *= i;

        }

        System.out.println("Factorial of " + input + " is " + factorial);

    }

}
