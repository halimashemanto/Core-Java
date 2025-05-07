
package midxmoopinheritance;

import midxmoopinheritance.subclass.Apple;
import midxmoopinheritance.subclass.Mango;


public class MidXmOOPInheritance {

 
    public static void main(String[] args) {
        
        Mango m = new Mango();
        Apple a = new Apple();
        
        m.setQuentity(50);
        m.setRawOrRipe("Raw");
        m.setSize("Medium");
        m.setSweetOrSour("Sour");
        m.setWeight(15);
        
        m.details();
        
        a.setIsImported("Yes");
        a.setQuality("Good");
        a.setQuentity(5.5);
        a.setRedOrGreen(true);
        a.setSize("Small");
        a.setSweetOrSour("Sweet");
        a.details();
        
    }
    
}
