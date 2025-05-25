package promptalertradious;

import java.util.Scanner;

public class PromptAlertRadious {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radious number.");
        float zeroNeg = s.nextFloat();
  
        System.out.println("Sorry, Zero & any Negative Number are not Valid Radious Number!! ");
        System.out.println("Please Enter Positive Radious Number.");
        int radius = s.nextInt();
        double pi = 3.142;
        double result = pi * (radius * radius);
        System.out.println("Area of circle is : " + result);
    }
}
// Another method IF ELSE 

//        System.out.println("Enter Radious number.");
//
//        if (rad <= 0) {
//            System.out.println("Sorry, Zero & any Negative Number are not Valid Radious Number!!");
//            System.out.println("please enter positive radious number");
//            float rad = s.nextFloat();
//
//            float radius = s.nextFloat();
//
//            double pi = 3.142;
//            double result = pi * (radius * radius);
//
//            System.out.println(" Total Value is " + result);
//
//        } else {
//            System.out.println("It's not a radious number");
//
//        }
}
}
