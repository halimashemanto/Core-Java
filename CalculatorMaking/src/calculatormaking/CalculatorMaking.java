package calculatormaking;

import java.util.Scanner;

public class CalculatorMaking {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        double num1 = s.nextDouble();

        System.out.println("Enter 2nd Number");
        double num2 = s.nextDouble();

        System.out.println("Please choice a Mathmatic Operations");
        String operation = s.next();

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid Choice !!");
        }

        System.out.println("Result is = " + result);

    }

}
