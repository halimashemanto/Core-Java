package printwriterfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.io.PrintWriter;

public class PrintWriterFile {

    public static void main(String[] args) throws FileNotFoundException {


        //eta best practice
        File f = new File("C:\\Users\\Admin\\Desktop\\input.txt");

        PrintWriter pw = new PrintWriter(f);
        pw.println("Most popular language in the world.");

        pw.close();

        Scanner s = new Scanner(f);
        System.out.println(s.nextLine());

        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
    }
}

// eta easy way
//        try (PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\input.txt")) {
//            pw.println("""
//                                   Java is high level programing language.
//                                   """);
//            pw.println("Most popular language in the world.");
//        }





