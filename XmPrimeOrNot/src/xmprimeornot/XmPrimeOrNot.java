package xmprimeornot;

import java.util.Scanner;

public class XmPrimeOrNot {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Number . ");
        int input = s.nextInt();

        int count = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            
            System.out.println(input + "  is PRIME Number ");
            
        } 
        else {
            
            System.out.println(input + " is NOT PRIME Number ");

        }
    }

}
