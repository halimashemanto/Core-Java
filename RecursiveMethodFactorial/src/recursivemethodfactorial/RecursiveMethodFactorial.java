package recursivemethodfactorial;

import java.util.Scanner;

public class RecursiveMethodFactorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int in = s.nextInt();

        System.out.println(factorial(in));

    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.println(n);
            System.out.println("----------------");
            return n * factorial(n - 1);
        }
    }
}
