package circlearea;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius ");

        int radius = input.nextInt();
        
        double pi = 3.142;
        double result = pi * (radius * radius);
        
        System.out.println("Area of circle is : " + result);
        
  
        
    }

}
