package methododdeven;

import java.util.Scanner;

public class MethodOddEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Number. ");
        int input = s.nextInt();

        String result = oddEven(input);
        System.out.println(result);

    }

    public static String oddEven(long userInput) {

        String result = "";

        if (userInput % 2 == 0) {

            result = userInput + " is Even Number";
        } else {

            result = userInput + " is odd Number";

        }
        return result;
    }

}
