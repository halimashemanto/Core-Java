package midxmexeptionhandler;

import java.util.Scanner;

public class MidXmExeptionHandler {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter 1st Number.");
            int input1 = s.nextInt();

            System.out.println("Enter 2nd Number.");
            int input2 = s.nextInt();

            int result = input1 / input2;
            System.out.println(result);

        } catch (Exception she) {
            System.out.println(she);
        }

    }

}
