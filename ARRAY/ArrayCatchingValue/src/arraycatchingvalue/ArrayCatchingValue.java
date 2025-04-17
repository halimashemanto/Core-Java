package arraycatchingvalue;

import java.util.Scanner;

public class ArrayCatchingValue {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter limit.");
        int n = s.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < marks.length; i++) {
            System.out.println(" Enter Mark.");
            int mark = s.nextInt();
            marks[i] = mark;

            System.out.println(" Enter name.");
            String name = s.next();
            names[i] = name;
        }

        for (int i = 0; i < names.length; i++) {

            System.out.println("My name is " + names[i] + " & marks is " + marks[i] + ".");

        }

    }

}
