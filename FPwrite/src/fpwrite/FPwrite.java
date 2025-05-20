
package fpwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FPwrite {

    
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("C:\\Users\\User\\OneDrive\\Desktop\\input.txt");
        PrintWriter pw = new PrintWriter(f);
        
        pw.println("kz");
        
        pw.close();
        
        Scanner s = new Scanner(f);
        System.out.println(s.nextLine());
        
        while(s.hasNextLine()){
                System.out.println(s.nextLine());

        
        }

    }
    
}
