
package abstractinterface.abs;

import java.util.Date;


public class Circle extends Geo{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, Date dateCreated) {
        super(filled, dateCreated);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);

    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
