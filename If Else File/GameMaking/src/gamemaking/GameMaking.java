package gamemaking;

import java.util.Scanner;

public class GameMaking {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int lottery = (int) (Math.random() * 10);

        System.out.print("Enter your picking number ");
        int guess = s.nextInt();

        System.out.println("Random Number is " + lottery);

        if (guess == lottery) {
            System.out.println("Win");
        } 
        
        else {
            System.out.println("Sorry");
        }
    }
}
