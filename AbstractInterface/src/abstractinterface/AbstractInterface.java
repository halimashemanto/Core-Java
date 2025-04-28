
package abstractinterface;

import abstractinterface.abs.Circle;
import abstractinterface.abs.Geo;


public class AbstractInterface {

  
    public static void main(String[] args) {

           Geo gCircle = new Circle(5);
           
           System.out.println(gCircle.getArea());

    }
    
}
