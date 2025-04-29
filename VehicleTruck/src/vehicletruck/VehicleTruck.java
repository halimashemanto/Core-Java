
package vehicletruck;

import java.util.Scanner;
import vehicletruck.sub.Truck;
import vehicletruck.sup.Vehicle;


public class VehicleTruck {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Price.");
        
        double price = s.nextDouble();
                
        Truck t = new  Truck();
        
        t.setRegularPrice(price);
        t.setWeight(2100);
        
        
        System.out.println(t.getSalePrice());
            
    }
    
}
