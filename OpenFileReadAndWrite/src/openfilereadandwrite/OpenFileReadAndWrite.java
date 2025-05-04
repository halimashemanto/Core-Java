
package openfilereadandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class OpenFileReadAndWrite {

   
    public static void main(String[] args) throws FileNotFoundException {
       
        
        
        File f = new File("C:\\Users\\Admin\\Desktop\\input.txt");

        PrintWriter pw = new PrintWriter(f);
        pw.println("I want to be a good girl.");
        pw.println("A paragraph is a self-contained unit of discourse in writing dealing with "
                + "a particular point or idea. Though not required by the orthographic conventions of "
                + "any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose");
        
        pw.close();                                                                                                          
        
        
    }
    
}
