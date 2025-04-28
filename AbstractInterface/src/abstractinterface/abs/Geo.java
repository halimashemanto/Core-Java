
package abstractinterface.abs;

import java.util.Date;


public abstract class Geo {
     
    private String colour = "Yellow";
    private boolean filled;
    private Date dateCreated;

    public Geo() {
        dateCreated = new Date();
    }

    public Geo(boolean filled, Date dateCreated) {
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    
}
