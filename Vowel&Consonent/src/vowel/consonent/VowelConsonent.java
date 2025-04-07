package vowel.consonent;

import java.util.Scanner;

public class VowelConsonent {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a Letter");

        char ch = s.next().toLowerCase().charAt(0);

        if (ch.isletter(ch)) {
            switch (ch) {
                case 'A':                    break;

                case 'E':                    break;

                case 'I':                    break;

                case 'O':                    break;

                case 'U':                    break;

                System.out.println("THIS LETTER IS VOWEL");
                    break;

            }

        } else {

            System.out.println("THIS LETTER IS CONSONENT.");
        }

    }

}
