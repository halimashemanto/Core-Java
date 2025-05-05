package midxmfibonacci;

import java.util.Scanner;

public class MidXmFibonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number.");
        long input = s.nextLong();
        System.out.println("-------------------------------");
        System.out.println("Fibonacci Numbers are : ");
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int totalSum = num2;

        System.out.println(num1 + "");
        System.out.println(num2 + "");

        for (int i = 3; i <= input; i++) {

            sum = num1 + num2;
            System.out.println(sum + " ");
            totalSum += sum;
            num1 = num2;
            num2 = sum;

        }

    }

}
