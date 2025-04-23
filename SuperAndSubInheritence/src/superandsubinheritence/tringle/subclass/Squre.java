
package superandsubinheritence.tringle.subclass;

import java.util.Date;
import superandsubinheritence.tringle.Tringle;


public class Squre extends Tringle {
    
    private double side;

    public Squre() {
    }

    public Squre(double side) {
        this.side = side;
    }

    public Squre(double side, String colour, boolean filled, Date dateCreated, double height, double width) {
        super(colour, filled, dateCreated, height, width);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public double getArea(){
    
        return side*side;
    }
    
    public void printtringle(){
    
        System.out.println("Square Area is " +getArea() );
    }
    
    
}
