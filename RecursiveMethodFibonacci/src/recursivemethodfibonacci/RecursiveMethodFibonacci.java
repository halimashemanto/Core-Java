package recursivemethodfibonacci;

import java.util.Scanner;

public class RecursiveMethodFibonacci {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
       long in = s.nextLong();
        System.out.println(fibonacci(in));
        

    }

    public static long fibonacci(long n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            System.out.println(n);

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
