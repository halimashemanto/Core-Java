
package objclasspractice;

import java.awt.print.Book;
import objclasspractice.general.subclass.Mobile;
import objclasspractice.general.subclass.WaterPot;

public class ObjClassPractice {


    public static void main(String[] args) {
       Mobile m = new Mobile("Touch Screen", 198654854, 12.360, 548,"fmradio","ssc","black",158,989650,"Black", 45320, "red");
      
      
        System.out.println( m.toString());
      
         System.out.println(objAndClass());
         
         
         
        // WaterPot w = new WaterPot("glass", "plastic", 1, 50, "watermelon", "normal", "warm", "ice");
        // System.out.println(w.toString());
         
         WaterPot w = new WaterPot();
         w.setJuice("Mango");
         System.out.println(w.getJuice());
         w.setColour("orange");
         System.out.println(w.getColour());
         
        justPractice();
         
        
    }
    public static void justPractice(){
    
        System.out.println("dekhte chai ans ase kina");
    }
    
   public static String objAndClass (){
   
   return "I am Shimanto";
   } 
}
