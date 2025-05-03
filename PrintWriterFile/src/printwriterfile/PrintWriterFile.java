package printwriterfile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterFile {

    public static void main(String[] args) throws FileNotFoundException {

        try (PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\input.txt")) {
            pw.println("""
                                   Java is high level programing language.
                                   """);
            pw.println("Most popular language in the world.");
        }
    }

}
