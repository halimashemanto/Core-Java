package methodforfactorial;

import java.util.Scanner;

public class MethodForFactorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Factorial Number");
        int input = s.nextInt();

        String result = factorial(input);
        System.out.println(result);

    }

    public static String factorial(long userInput) {

        int count = 1;
        long factorial = 1;
        String result = "";
        if (userInput < 0) {
            result = "Any negative number are not allowed";
        }
        else {
            do {
                factorial *= count;
                count++;
          }
            while (count <= userInput);
        }

        result = "Factorial Number is = " + factorial;

        return result;
    }

}
