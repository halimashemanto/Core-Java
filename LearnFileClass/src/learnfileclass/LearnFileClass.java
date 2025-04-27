
package learnfileclass;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class LearnFileClass {

  
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("C:\\Users\\Admin\\Desktop\\jee.txt");
        
        // PrintWriter pw = new PrintWriter(f);
        
        PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\java.txt");
        
        
        pw.print("java learner." + "\n");
        pw.print("most popular language in the world");
        pw.close();

    }
    
}
