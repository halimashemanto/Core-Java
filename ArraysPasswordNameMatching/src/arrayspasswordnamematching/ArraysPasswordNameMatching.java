package arrayspasswordnamematching;

import java.util.Scanner;

public class ArraysPasswordNameMatching {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] names = {"Suprova", "Shemanto", "Simki", "Safwan", "Shawon"};
        int[] passwords = {10, 20, 30, 40, 50};

        System.out.println("Enter user name.");
        String name = s.next();

        for (int i = 0; i < names.length; i++) {

            if (name.equalsIgnoreCase(names[i])) {
                int index = i;
                System.out.println("Enter password.");
                int password = s.nextInt();

                if (password == passwords[index]) {
                    System.out.println("WELCOME" + " " + names[i]);
                } else {
                    System.out.println("Password is incorrect.");
                }
                break;
            }
            if (i == names.length - 1) {
                System.out.println("User name is incorrect.");

            }

        }
    }

}
