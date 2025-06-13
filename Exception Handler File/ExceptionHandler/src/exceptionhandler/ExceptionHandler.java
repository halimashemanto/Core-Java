package exceptionhandler;

import java.util.Scanner;

public class ExceptionHandler {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter 1st value.");
            int input1 = s.nextInt();

            System.out.println("Enter 2nd value.");
            int input2 = s.nextInt();
            int result = input1 / input2;

            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        }

//        try {
//            int result = 1000 / 100;
//            System.out.println(result);
//        } catch (ArithmeticException s) {
//
//            System.out.println(s);
//        }
//        try {
//           // Scanner s = new Scanner(System.in);
//        System.out.println("Enter 1st value.");
//        int in1 = s.nextInt();
//
//        System.out.println("Enter 2nd value.");
//        int in2 = s.nextInt();
//        
//         int result = in1/in2;
//            System.out.println(result);
//        } catch (Exception e) {
//            
//            System.out.println(e);
//        }
    }

}
