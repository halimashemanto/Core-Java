package learnfileclassevennumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LearnFileClassEvenNumber {

    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter pw1 = new PrintWriter("C:\\Users\\Admin\\Desktop\\Even.txt");
        PrintWriter pw2 = new PrintWriter("C:\\Users\\Admin\\Desktop\\Odd.txt");

        long userInput = 50;

        String result = "";

        for (int i = 1; i <= userInput; i++) {

            if (i % 2 == 0) {
                pw1.println(i);
            }
            else {
                 pw2.println(i);
            }
        }
        
        System.out.println("Your files are created.");

        pw1.close();
        pw2.close();

    }

}
