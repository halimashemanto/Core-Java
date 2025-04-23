
package superandsubinheritence.tringle;

import java.util.Date;

public class Tringle  {
    
    private String colour;
    private boolean filled;
    private Date dateCreated;
    
    private double height;
    private double width;

    public Tringle() {
    }

    public Tringle(String colour, boolean filled, Date dateCreated, double height, double width) {
        this.colour = colour;
        this.filled = filled;
        this.dateCreated = dateCreated;
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
 
    public double getArea(){
    
        return .05*(height*width);
    }
    
    public void printtringle(){
    
        System.out.println("Tringle Area is " +getArea() );
    }
}
